package ${PACKAGE_NAME};

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

#parse("My Header.java")
public class ${NAME} extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
