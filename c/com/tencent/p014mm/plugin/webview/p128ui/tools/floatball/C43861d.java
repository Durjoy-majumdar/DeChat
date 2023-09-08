package com.tencent.p014mm.plugin.webview.p128ui.tools.floatball;

import android.content.Intent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import e00.C45515k0;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.i25;
import xv0.C112185h;
import xv0.C53451i;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d */
public final class C43861d implements C45515k0 {

    /* renamed from: a */
    public static final C43861d f118783a = new C43861d();

    /* renamed from: b */
    public static final C13601g f118784b = C36568h.m40985a(C30604d.f82420d);

    /* renamed from: c */
    public static final ConcurrentHashMap<String, SoftReference<C43522y>> f118785c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<String, Boolean> f118786d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final C112185h f118787e = new C43866c();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d$d */
    public static final class C30604d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30604d f82420d = new C30604d();

        public C30604d() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = false;
            if (hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_weview_new_float_ball, 1) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d$a */
    public static final class C43862a {

        /* renamed from: a */
        public final String f118788a;

        /* renamed from: b */
        public final String f118789b;

        /* renamed from: c */
        public final String f118790c;

        /* renamed from: d */
        public final long f118791d;

        public C43862a(String str, String str2, String str3, long j) {
            C87412m.m108594g(str, "rawUrl");
            C87412m.m108594g(str3, "key");
            this.f118788a = str;
            this.f118789b = str2;
            this.f118790c = str3;
            this.f118791d = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C43862a)) {
                return false;
            }
            C43862a aVar = (C43862a) obj;
            return C87412m.m108589b(this.f118788a, aVar.f118788a) && C87412m.m108589b(this.f118789b, aVar.f118789b) && C87412m.m108589b(this.f118790c, aVar.f118790c) && this.f118791d == aVar.f118791d;
        }

        public int hashCode() {
            int hashCode = this.f118788a.hashCode() * 31;
            String str = this.f118789b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            long j = this.f118791d;
            return ((((hashCode + hashCode2) * 31) + this.f118790c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "WebViewFloatBallDataObject(rawUrl=" + this.f118788a + ", currentProcess=" + this.f118789b + ", key=" + this.f118790c + ", activeTime=" + this.f118791d + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d$b */
    public static final class C43863b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C43862a f118792d;

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/content/Intent;", "kotlin.jvm.PlatformType", "intent", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Landroid/content/Intent;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d$b$a */
        public static final class C43864a<InputType, ResultType> implements C80883e {

            /* renamed from: d */
            public static final C43864a<InputType, ResultType> f118793d = new C43864a<>();

            public void invoke(Object obj, C1256g gVar) {
                Intent intent = (Intent) obj;
                C115669n.INSTANCE.idkeyStat(1553, 10, 1, false);
                C43861d dVar = C43861d.f118783a;
                C87412m.m108593f(intent, "intent");
                C43861d.m48033a(dVar, intent);
                if (gVar != null) {
                    gVar.mo894a(new IPCVoid());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d$b$b */
        public static final class C43865b extends C87413o implements C32226l<IPCVoid, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C43862a f118794d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43865b(C43862a aVar) {
                super(1);
                this.f118794d = aVar;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((IPCVoid) obj, LocaleUtil.ITALIAN);
                C43861d.f118786d.put(this.f118794d.f118790c, Boolean.TRUE);
                return C13598b0.f38549a;
            }
        }

        public C43863b(C43862a aVar) {
            this.f118792d = aVar;
        }

        public final void run() {
            String str = this.f118792d.f118788a;
            boolean z = false;
            if (!(str == null || C112551y.m153811k(str)) && !Util.isNullOrNil(this.f118792d.f118790c)) {
                C43861d dVar = C43861d.f118783a;
                if (!C43861d.f118786d.containsKey(this.f118792d.f118790c)) {
                    String str2 = this.f118792d.f118788a;
                    C45696d dVar2 = (C45696d) C86709a0.m107533q(C45696d.class);
                    if (dVar2 != null && dVar2.mo70989eQ(str2)) {
                        z = true;
                    }
                    if (z) {
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", this.f118792d.f118788a);
                        intent.putExtra("float_ball_key", this.f118792d.f118790c);
                        String str3 = C44594n1.m49046b() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
                        C87412m.m108593f(str3, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
                        C28947a.m38500a(str3, intent, C43864a.f118793d, new C43865b(this.f118792d));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.d$c */
    public static final class C43866c extends C53451i {
        /* renamed from: G1 */
        public void mo64040G1(BallInfo ballInfo) {
        }

        /* renamed from: H */
        public void mo64041H(BallInfo ballInfo) {
            String string;
            if (ballInfo != null && (string = ballInfo.f311678C.getString("rawUrl")) != null) {
                String string2 = ballInfo.f311678C.getString("webviewCurrentProcess");
                String string3 = ballInfo.f311678C.getString("float_ball_key");
                if (string3 != null) {
                    C43861d.f118783a.mo68420b(new C43862a(string, string2, string3, ballInfo.f311703x));
                }
            }
        }

        /* renamed from: c2 */
        public void mo64042c2(BallInfo ballInfo) {
            String string;
            if (ballInfo != null && (string = ballInfo.f311678C.getString("rawUrl")) != null) {
                String string2 = ballInfo.f311678C.getString("webviewCurrentProcess");
                String string3 = ballInfo.f311678C.getString("float_ball_key");
                if (string3 != null) {
                    C43861d dVar = C43861d.f118783a;
                    C43862a aVar = new C43862a(string, string2, string3, ballInfo.f311703x);
                    ((C119157j) C119157j.f356862d).mo183876g(new C43868f(aVar), "WebViewFloatBallThread");
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m48033a(C43861d dVar, Intent intent) {
        dVar.getClass();
        try {
            String stringExtra = intent.getStringExtra("float_ball_key");
            if (!Util.isNullOrNil(stringExtra)) {
                C87412m.m108591d(stringExtra);
                C43522y c = dVar.mo68421c(stringExtra);
                if (c != null) {
                    String stringExtra2 = intent.getStringExtra("rawUrl");
                    Log.m105924i("MicroMsg.WebViewFloatBallManager", "onBallRemove " + stringExtra2);
                    ((C119157j) C119157j.f356862d).mo183895z(new C43870g(stringExtra, c));
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewFloatBallManager", "onRemove is null, " + e.getMessage());
        }
    }

    /* renamed from: d */
    public static final boolean m48034d() {
        return ((Boolean) ((C36570n) f118784b).getValue()).booleanValue();
    }

    /* renamed from: b */
    public final void mo68420b(C43862a aVar) {
        if (aVar != null && Math.abs(System.currentTimeMillis() - aVar.f118791d) >= 1800000) {
            ((C119157j) C119157j.f356862d).mo183876g(new C43863b(aVar), "WebViewFloatBallThread");
        }
    }

    /* renamed from: c */
    public final C43522y mo68421c(String str) {
        C87412m.m108594g(str, "id");
        SoftReference softReference = f118785c.get(str);
        if (softReference != null) {
            return (C43522y) softReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public void mo68422e(MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo != null) {
            i25 i25 = new i25();
            try {
                i25.parseFrom(multiTaskInfo.field_data);
                String str = i25.f135051e;
                if (str != null) {
                    String str2 = i25.f135048H;
                    String str3 = multiTaskInfo.field_id;
                    if (str3 != null) {
                        mo68420b(new C43862a(str, str2, str3, multiTaskInfo.field_updateTime));
                    }
                }
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.WebViewFloatBallManager", "WebMultiTaskData parse fail", th);
            }
        }
    }

    /* renamed from: f */
    public void mo68423f(MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo != null) {
            i25 i25 = new i25();
            try {
                i25.parseFrom(multiTaskInfo.field_data);
                String str = i25.f135051e;
                if (str != null) {
                    String str2 = i25.f135048H;
                    String str3 = multiTaskInfo.field_id;
                    if (str3 != null) {
                        C43862a aVar = new C43862a(str, str2, str3, multiTaskInfo.field_updateTime);
                        ((C119157j) C119157j.f356862d).mo183876g(new C43868f(aVar), "WebViewFloatBallThread");
                    }
                }
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.WebViewFloatBallManager", "WebMultiTaskData parse fail", th);
            }
        }
    }
}
