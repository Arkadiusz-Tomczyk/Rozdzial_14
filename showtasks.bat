call runcrud.bat
if "%ERRORLEVEL%" == "0" goto runexplorer
echo.
echo runcrud.bat has errors - breaking work
goto fail

:runexplorer
echo RUNEXPLORER
"C:\Program Files (x86)\Mozilla Firefox\firefox.exe" http://localhost:8080/v1/tasks/getTasks
goto end

:fail
echo FAIL
echo.
echo There were errors

:end
echo FINISH
echo.
echo Work is finished.