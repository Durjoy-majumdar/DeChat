package p22;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: p22.h */
public final class C110120h {

    /* renamed from: a */
    public static final C110120h f329457a = new C110120h();

    /* renamed from: b */
    public static C110109e f329458b;

    /* renamed from: c */
    public static InputConnection f329459c;

    /* renamed from: d */
    public static WeakReference<View> f329460d;

    /* renamed from: e */
    public static String f329461e;

    /* renamed from: f */
    public static final EditorInfo f329462f = new EditorInfo();

    /* renamed from: g */
    public static ArrayList<C110122b> f329463g = new ArrayList<>();

    /* renamed from: h */
    public static List<C110121a> f329464h = new ArrayList();

    /* renamed from: p22.h$a */
    public static final class C110121a {

        /* renamed from: a */
        public boolean f329465a;

        /* renamed from: b */
        public C110108d f329466b;
    }

    /* renamed from: p22.h$b */
    public interface C110122b {
        void onChange(int i);
    }

    /* renamed from: a */
    public final void mo161516a() {
        InputConnection inputConnection;
        C110109e eVar = f329458b;
        if (eVar != null) {
            eVar.mo161508d((JSONObject) null, (InputConnection) null);
        }
        WeakReference<View> weakReference = f329460d;
        if (weakReference != null) {
            weakReference.clear();
        }
        f329460d = null;
        if (Build.VERSION.SDK_INT >= 24 && (inputConnection = f329459c) != null) {
            inputConnection.closeConnection();
        }
        f329459c = null;
    }
}
