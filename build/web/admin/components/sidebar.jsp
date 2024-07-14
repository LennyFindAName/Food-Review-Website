<%-- 
    Document   : sidebar
    Created on : Jun 3, 2024, 11:45:45 AM
    Author     : legion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Sidebar  -->
<nav id="sidebar">
    <div class="sidebar_blog_1">
        <div class="sidebar-header">
            <div class="logo_section">
                <a href="index.html"><img class="logo_icon img-responsive" src="images/logo/logo_icon.png" alt="#" /></a>
            </div>
        </div>
        <div class="sidebar_user_info">
            <div class="icon_setting"></div>
            <div class="user_profle_side">
                <div class="user_img"><img class="img-responsive" src="images/layout_img/user_img.jpg" alt="#" /></div>
                <div class="user_info">
                    <h6>${sessionScope.currentUser.displayName}</h6>
                    <p><span class="online_animation"></span> Online</p>
                </div>
            </div>
        </div>
    </div>

    <div class="sidebar_blog_2">
        <h4>General</h4>
        <ul class="list-unstyled components">
            <li class="active">
                <a href="dashboard" ><i class="fa fa-dashboard yellow_color"></i> <span>Dashboard</span></a>
                
            </li>
            
            <li><a href="show-mod"><i class="fa fa-group green_color"></i> <span>Moderators</span></a></li>
<!--            <li><a href="price.html"><i class="fa fa-briefcase blue1_color"></i> <span>Pricing Tables</span></a></li>-->
<!--            <li>
                <a href="contact.html">
                    <i class="fa fa-paper-plane red_color"></i> <span>Contact</span></a>
            </li>
            <li class="active">
                <a href="#additional_page" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle"><i class="fa fa-clone yellow_color"></i> <span>Additional Pages</span></a>
                <ul class="collapse list-unstyled" id="additional_page">
                    <li>
                        <a href="profile.html">> <span>Profile</span></a>
                    </li>
                    <li>
                        <a href="project.html">> <span>Projects</span></a>
                    </li>
                    <li>
                        <a href="login.html">> <span>Login</span></a>
                    </li>
                    <li>
                        <a href="404_error.html">> <span>404 Error</span></a>
                    </li>
                </ul>
            </li>
            <li><a href="map.html"><i class="fa fa-map purple_color2"></i> <span>Map</span></a></li>
            <li><a href="charts.html"><i class="fa fa-bar-chart-o green_color"></i> <span>Charts</span></a></li>
            <li><a href="settings.html"><i class="fa fa-cog yellow_color"></i> <span>Settings</span></a></li>-->
        </ul>
    </div>
    
</nav>
<!-- end sidebar -->
