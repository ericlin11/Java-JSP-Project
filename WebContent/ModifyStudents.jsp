<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head> </head>
    <body>
        <ul>
            <li><a href="/LogStudents">Log</a></li>
            <li><a href="/ViewStudents">View</a></li>
            <li><a href="/ModifyStudents">Modify</a></li>
        </ul>
        <form action="loadTimePunch" id="timepunchform">
            <label for="Student">Employee</label>
            <select name="Student" id="Student" form="timepunchform">
                <c:forEach items="${students}" var="student">
                    <option value='<c:out value="${student.name}" />'><c:out value="${student.name}" /></option>
                </c:forEach>
            </select>

            <p>Date</p>
			<label for="Month">Date:</label>
			<select name="Month" id="Month">
				<option value="1" >1</option>
				<option value="2" >2</option>
				<option value="3" >3</option>
				<option value="4" >4</option>
				<option value="5" >5</option>
				<option value="6" >6</option>
				<option value="7" >7</option>
				<option value="8" >8</option>
				<option value="9" >9</option>
				<option value="10" >10</option>
				<option value="11" >11</option>
				<option value="12" >12</option>
			</select>
			
			<label for="Day">Day</label>
			<select name="Day" id="Day">
				<option value="1" >1</option>
				<option value="2" >2</option>
				<option value="3" >3</option>
				<option value="4" >4</option>
				<option value="5" >5</option>
				<option value="6" >6</option>
				<option value="7" >7</option>
				<option value="8" >8</option>
				<option value="9" >9</option>
				<option value="10" >10</option>
				<option value="11" >11</option>
				<option value="12" >12</option>
				<option value="13" >13</option>
				<option value="14" >14</option>
				<option value="15" >15</option>
				<option value="16" >16</option>
				<option value="17" >17</option>
				<option value="18" >18</option>
				<option value="19" >19</option>
				<option value="20" >20</option>
				<option value="21" >21</option>
				<option value="22" >22</option>
				<option value="23" >23</option>
				<option value="24" >24</option>
				<option value="25" >25</option>
				<option value="26" >26</option>
				<option value="27" >27</option>
				<option value="28" >28</option>
				<option value="29" >29</option>
				<option value="30" >30</option>
				<option value="31" >31</option>
			</select>
			
			<label for="Year">Year</label>
			<select name="Year" id="Year">
				<option value="2021" >2021</option>
				<option value="2022" >2022</option>
				<option value="2023" >2023</option>
				<option value="2024" >2024</option>
				<option value="2025" >2025</option>
			</select>

            <input type="submit" value="Load">
        </form>

        <form action="modifyTimePunch" id="modifyform">
        
<br>
<label for="TimeIn">Time In:</label>
<label for="Hour"> Hour:</label>
<select name="Hourin" id="Hourin">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>


</select>

<label for="Minute"> Minute:</label>
<select name="Minin" id="Minin">
<option value="00">00</option>
<option value="15">15</option>
<option value="30">30</option>
<option value="45">45</option>

</select>

<label for="AM/PM"> AM/PM</label>
<select name="AM/PMin" id="AM/PMin">
<option value="AM">AM</option>
<option value="PM">PM</option>

</select>

<br>
<label for="TimeOut">Time Out:</label>
<label for="Hour"> Hour:</label>
<select name="Hourout" id="Hourout">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>


</select>

<label for="Minute"> Minute:</label>
<select name="Minout" id="Minout">
<option value="00">00</option>
<option value="15">15</option>
<option value="30">30</option>
<option value="45">45</option>

</select>

<label for="AM/PM"> AM/PM</label>
<select name="AM/PMout" id="AM/PMout">
<option value="AM">AM</option>
<option value="PM">PM</option>

</select>
        
        
            <!-- todo time punch -->
            <input type="submit" value="modify">
        </form>
    </body>
</html>
