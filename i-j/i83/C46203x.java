package i83;

import android.os.Bundle;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.model.C43728t;
import com.tencent.p014mm.plugin.webview.model.C43729u;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ea3.C45600q;
import ea3.C7621p;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ob0.C47350c;
import rx3.C13598b0;
import sx3.C110823p;
import sx3.C77813z;
import te3.C49052cv;
import te3.C49193dv;
import z04.C112550d0;

/* renamed from: i83.x */
public final class C46203x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46198u f124546d;

    /* renamed from: e */
    public final /* synthetic */ String[] f124547e;

    /* renamed from: i83.x$a */
    public static final class C46204a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46198u f124548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46204a(C46198u uVar) {
            super(0);
            this.f124548d = uVar;
        }

        public Object invoke() {
            C46191m mVar;
            if (!this.f124548d.f124533p.f306531b.mo62187a(C39623j.C39626c.STARTED)) {
                Log.m105928w(this.f124548d.f124525e, "pageLogic is inActive!");
            } else {
                C46198u uVar = this.f124548d;
                C45600q qVar = uVar.f124538u;
                if (qVar.f123322c == 2) {
                    uVar.f124539v.postValue(C46191m.BadNet);
                } else {
                    C54219z<C46191m> zVar = uVar.f124539v;
                    double d = qVar.f123321b;
                    boolean z = false;
                    if (0.7d <= d && d <= 1.0d) {
                        mVar = C46191m.NeedTrans;
                    } else {
                        if (0.2d <= d && d <= 0.7d) {
                            mVar = C46191m.NotSure;
                        } else {
                            if (0.0d <= d && d <= 0.2d) {
                                z = true;
                            }
                            mVar = z ? C46191m.NoNeedTrans : C46191m.Unknown;
                        }
                    }
                    zVar.postValue(mVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C46203x(C46198u uVar, String[] strArr) {
        this.f124546d = uVar;
        this.f124547e = strArr;
    }

    public final void run() {
        String str;
        boolean z;
        C45600q qVar = this.f124546d.f124538u;
        String[] strArr = this.f124547e;
        C87412m.m108593f(LocaleUtil.getApplicationLanguage(), "getApplicationLanguage()");
        C46204a aVar = new C46204a(this.f124546d);
        qVar.getClass();
        C87412m.m108594g(strArr, "sampleArray");
        if (!(strArr.length == 0)) {
            List<String> a0 = C110823p.m151001a0(strArr);
            if (a0.size() > 1000) {
                a0 = a0.subList(0, 1000);
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (String str2 : a0) {
                Pattern compile = Pattern.compile("[0-9]");
                C87412m.m108593f(compile, "compile(pattern)");
                C87412m.m108594g(str2, "input");
                String replaceAll = compile.matcher(str2).replaceAll("");
                C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                String[] strArr2 = {"@", "＠", "¥", "©", "{{", "<%", "http"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        z = false;
                        break;
                    } else if (C112550d0.m153801u(replaceAll, strArr2[i2], true)) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    arrayList.add(replaceAll);
                }
                byte[] bytes = replaceAll.getBytes(qVar.f123320a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                i += bytes.length;
            }
            if (i >= 0) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                loop2:
                while (true) {
                    str = "";
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        byte[] bytes2 = str3.getBytes(qVar.f123320a);
                        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
                        if (bytes2.length > 100) {
                            arrayList2.add(str3);
                        } else {
                            str = str + ' ' + str3;
                            byte[] bytes3 = str.getBytes(qVar.f123320a);
                            C87412m.m108593f(bytes3, "this as java.lang.String).getBytes(charset)");
                            if (bytes3.length > 100) {
                                arrayList2.add(str);
                            }
                        }
                    }
                    break loop2;
                }
                if (str.length() > 0) {
                    arrayList2.add(str);
                }
                if (arrayList2.size() > 1) {
                    C77813z.m93909o(arrayList2, new C7621p());
                }
                int size = arrayList2.size();
                List<String> list = arrayList2;
                if (size > 10) {
                    list = arrayList2.subList(0, 10);
                }
                LinkedList<String> linkedList = new LinkedList<>();
                for (String add : list) {
                    linkedList.add(add);
                }
                C43729u uVar = new C43729u();
                String applicationLanguage = LocaleUtil.getApplicationLanguage();
                int i3 = 2;
                try {
                    int[] iArr = {2};
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new C49052cv();
                    bVar.f127067b = new C49193dv();
                    bVar.f127068c = "/cgi-bin/micromsg-bin/checktextlanguage";
                    bVar.f127069d = 528;
                    bVar.f127070e = 0;
                    bVar.f127071f = 0;
                    C49052cv cvVar = (C49052cv) bVar.mo72403a().f127055a.f127080a;
                    cvVar.f131971d = linkedList;
                    cvVar.f131972e = applicationLanguage;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Bundle();
                    ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C43728t(uVar, iArr, countDownLatch));
                    try {
                        countDownLatch.await(1000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Log.m105928w("MicroMsg.NetSceneCheckTextLanguage", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.NetSceneCheckTextLanguage", e, "", new Object[0]);
                    }
                    Log.m105924i("MicroMsg.NetSceneCheckTextLanguage", "CheckTextLanguage end");
                    i3 = iArr[0];
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.NetSceneCheckTextLanguage", "CheckTextLanguage failed");
                }
                qVar.f123322c = i3;
                qVar.f123321b = i3 == 0 ? 1.0d : 0.0d;
                Log.m105924i("MicroMsg.WebViewLanguageCheckTask", "check ratio = " + qVar.f123321b);
                aVar.invoke();
            }
        }
    }
}
