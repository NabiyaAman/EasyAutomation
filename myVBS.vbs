Set objExcel = CreateObject("Excel.Application")
Set objWorkbook = objExcel.Workbooks.Open("D:\easyAutomation2017\GoEasy\requiredSource\TestData1.xlsm")

objExcel.Application.Run "TestData1.xlsm!refreshXLS" 
objExcel.ActiveWorkbook.Close

objExcel.Application.Quit
WScript.Quit