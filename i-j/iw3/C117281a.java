package iw3;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import hw3.C117118b;
import java.util.HashMap;
import java.util.Map;
import jw3.C108778c;
import jw3.C117367a;
import qv3.C47885b;
import rv3.C118244g;
import rv3.C118245h;
import uv3.C118614d;

/* renamed from: iw3.a */
public class C117281a {

    /* renamed from: f */
    public static boolean f351137f;

    /* renamed from: g */
    public static MMHandler f351138g;

    /* renamed from: h */
    public static final C118244g<C117281a> f351139h = new C117282a();

    /* renamed from: a */
    public final Map<String, C117287c> f351140a = new HashMap();

    /* renamed from: b */
    public C117367a f351141b = null;

    /* renamed from: c */
    public final C108778c f351142c = new C108488b();

    /* renamed from: d */
    public final C118614d f351143d = new C117283c();

    /* renamed from: e */
    public C47885b f351144e = new C108489d();

    /* renamed from: iw3.a$b */
    public class C108488b implements C108778c {
        public C108488b() {
        }
    }

    /* renamed from: iw3.a$d */
    public class C108489d implements C47885b {
        public C108489d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view == null || motionEvent == null) {
                return false;
            }
            C118245h.m166799a("TuringTouch", "[method: onTouch ] " + motionEvent.getAction());
            C117281a aVar = C117281a.this;
            aVar.getClass();
            C117281a.m165348a(aVar, String.valueOf(view.hashCode()), motionEvent);
            return false;
        }
    }

    /* renamed from: iw3.a$a */
    public class C117282a extends C118244g<C117281a> {
        /* renamed from: a */
        public Object mo181965a() {
            return new C117281a();
        }
    }

    /* renamed from: iw3.a$c */
    public class C117283c implements C118614d {
        public C117283c() {
        }
    }

    /* renamed from: iw3.a$e */
    public class C117284e extends MMHandler implements C117118b {
        public C117284e(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    Object obj = message.obj;
                    if (obj != null) {
                        if (obj instanceof C117285f) {
                            C117285f fVar = (C117285f) obj;
                            Map<String, C117287c> map = C117281a.this.f351140a;
                            if (map != null) {
                                if (((HashMap) map).containsKey(fVar.f351147a)) {
                                    C117287c cVar = (C117287c) ((HashMap) C117281a.this.f351140a).get(fVar.f351147a);
                                    if (cVar != null) {
                                        cVar.mo165746b(fVar.f351148b, this);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: iw3.a$f */
    public class C117285f {

        /* renamed from: a */
        public String f351147a;

        /* renamed from: b */
        public MotionEvent f351148b;

        public C117285f(C117281a aVar, C117282a aVar2) {
        }
    }

    public C117281a() {
        if (!f351137f) {
            f351137f = true;
            synchronized (this) {
                C118245h.m166799a("TuringTouch", "doInitDispatch");
                f351138g = new C117284e("TuringDispatch");
            }
        }
    }

    /* renamed from: a */
    public static void m165348a(C117281a aVar, String str, MotionEvent motionEvent) {
        aVar.getClass();
        try {
            C117285f fVar = new C117285f(aVar, (C117282a) null);
            fVar.f351147a = str;
            fVar.f351148b = MotionEvent.obtain(motionEvent);
            MMHandler mMHandler = f351138g;
            if (mMHandler != null) {
                mMHandler.obtainMessage(1, fVar).sendToTarget();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static C117281a m165349b() {
        C118244g<C117281a> gVar = f351139h;
        T t = gVar.f353422a;
        if (t == null) {
            synchronized (gVar) {
                t = gVar.f353422a;
                if (t == null) {
                    t = gVar.mo181965a();
                    gVar.f353422a = t;
                }
            }
        }
        return (C117281a) t;
    }
}
