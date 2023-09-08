package p176jc;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p993kc.C108996e;
import p993kc.C88135b;

/* renamed from: jc.q */
public final class C108699q {

    /* renamed from: a */
    public static final C108699q f325532a = new C108699q();

    /* renamed from: b */
    public static C108996e f325533b;

    /* renamed from: c */
    public static InputConnection f325534c;

    /* renamed from: d */
    public static WeakReference<View> f325535d;

    /* renamed from: e */
    public static TextInputChannel.WxKeyboardType f325536e = TextInputChannel.WxKeyboardType.TEXT;

    /* renamed from: f */
    public static final EditorInfo f325537f = new EditorInfo();

    /* renamed from: g */
    public static ArrayList<C87936b> f325538g = new ArrayList<>();

    /* renamed from: h */
    public static List<C87935a> f325539h = new ArrayList();

    /* renamed from: jc.q$a */
    public static final class C87935a {

        /* renamed from: a */
        public boolean f254494a;

        /* renamed from: b */
        public C88135b f254495b;
    }

    /* renamed from: jc.q$b */
    public interface C87936b {
        /* renamed from: a */
        void mo111448a(int i, int i2);
    }

    /* renamed from: jc.q$c */
    public /* synthetic */ class C108700c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f325540a;

        static {
            int[] iArr = new int[TextInputChannel.WxKeyboardType.values().length];
            iArr[TextInputChannel.WxKeyboardType.TEXT.ordinal()] = 1;
            iArr[TextInputChannel.WxKeyboardType.NUMBER.ordinal()] = 2;
            iArr[TextInputChannel.WxKeyboardType.DIGIT.ordinal()] = 3;
            iArr[TextInputChannel.WxKeyboardType.IDCARD.ordinal()] = 4;
            iArr[TextInputChannel.WxKeyboardType.SAFEPASSWORD.ordinal()] = 5;
            f325540a = iArr;
        }
    }

    /* renamed from: a */
    public final void mo159717a() {
        InputConnection inputConnection;
        C108996e eVar = f325533b;
        if (eVar != null) {
            eVar.mo160117c((String) null, (InputConnection) null);
        }
        WeakReference<View> weakReference = f325535d;
        if (weakReference != null) {
            weakReference.clear();
        }
        f325535d = null;
        if (Build.VERSION.SDK_INT >= 24 && (inputConnection = f325534c) != null) {
            inputConnection.closeConnection();
        }
        f325534c = null;
    }
}
