</div>
</section>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/lib/layer/2.4/layer.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/defaultInput/renLi/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript">
	$ (function ()
    {
	    /*$("#min_title_list li").contextMenu('Huiadminmenu', {
	    	bindings: {
	    		'closethis': function(t) {
	    			console.log(t);
	    			if(t.find("i")){
	    				t.find("i").trigger("click");
	    			}		
	    		},
	    		'closeall': function(t) {
	    			alert('Trigger was '+t.id+'\nAction was Email');
	    		},
	    	}
	    });*/

	    $ ("body").Huitab (
	    {
	        tabBar : ".navbar-wrapper .navbar-levelone",
	        tabCon : ".Hui-aside .menu_dropdown",
	        className : "current",
	        index : 0,
	    });
    });
</script>
</body>
</html>
