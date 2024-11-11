<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:pageTemplate pageTitle="Cars">
    <h1>Cars</h1>
    <div class="container text-center">
        <div class="row">
            <div class="col">
                Car1
            </div>
            <div class="col">
                    Spot1
            </div>
            <div class="col">
                User1
            </div>

        </div>
    </div>
    <div class="container text-center">
        <div class="row">
            <div class="col">
                Car2
            </div>
            <div class="col">
                Spot2
            </div>
            <div class="col">
                User2
            </div>

        </div>
    </div>
    <h5>Free parking spots: ${numberOfFreeParkingSpots}</h5>
</t:pageTemplate>
