package ga1;

import android.util.Pair;
import ba1.C16777c;
import ba1.C16780k;
import ca1.C113264b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import g91.C20813c;
import j20.C21153d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import te3.C118427eg2;
import te3.C118478x14;
import te3.C22505ka3;
import z91.C23462b;

/* renamed from: ga1.c */
public class C20823c {

    /* renamed from: a */
    public final Map<String, List<Pair<String, String>>> f58826a;

    /* renamed from: b */
    public final C21153d f58827b = new C20825b((C20824a) null);

    /* renamed from: c */
    public boolean f58828c = false;

    /* renamed from: d */
    public String f58829d = null;

    /* renamed from: e */
    public int f58830e = 0;

    /* renamed from: ga1.c$b */
    public final class C20825b implements C21153d {
        public C20825b(C20824a aVar) {
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            int intValue;
            if (obj != null) {
                C20823c.this.f58829d = obj.getClass().getCanonicalName();
                C20823c.this.f58830e = obj.hashCode();
            }
            if ("finish".equals(str2) && "()V".equals(str3)) {
                C20823c cVar = C20823c.this;
                if (!cVar.f58828c) {
                    cVar.f58828c = true;
                    C20813c.m22810a().mo32508c(217, Long.valueOf(System.currentTimeMillis()));
                }
            } else if ("dealContentView".equals(str2) && "(Landroid/view/View;)V".equals(str3)) {
                C20823c.this.f58828c = false;
                C20813c.m22810a().mo32508c(219, Long.valueOf(System.currentTimeMillis()));
            } else if ("onKeyDown".equals(str2) && "(ILandroid/view/KeyEvent;)Z".equals(str3)) {
                if (objArr == null || objArr.length < 2 || !((intValue = objArr[0].intValue()) == 4 || intValue == 25 || intValue == 24)) {
                    C20813c.m22810a().mo32508c(218, Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public C20823c() {
        HashMap hashMap = new HashMap();
        this.f58826a = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("finish", "()V"));
        arrayList.add(Pair.create("dealContentView", "(Landroid/view/View;)V"));
        arrayList.add(Pair.create("onKeyDown", "(ILandroid/view/KeyEvent;)Z"));
        hashMap.put("com/tencent/mm/plugin/voip/ui/VideoActivity", arrayList);
    }

    /* renamed from: a */
    public final void mo32511a(long j) {
        Log.m105924i("HABBYGE-MALI.VoipFloatSession", "onVoipSessionExit");
        C22505ka3 e = C16777c.m16413e();
        if (e == null) {
            Log.m105920e("HABBYGE-MALI.VoipFloatSession", "_exitVoipSession, 不是合法session !!!");
        } else {
            Log.m105925i("HABBYGE-MALI.VoipFloatSession", "_exitVoipSession, curSession: %s", e.f64087d);
            C23462b.m28021f().mo36930q(e, j);
        }
        byte[] a = C116850b.m164831a("mmkv_sionpairD_table_hell");
        C118478x14 x142 = null;
        if (a != null) {
            if (!(a.length == 0)) {
                C118478x14 x143 = new C118478x14();
                try {
                    x143.parseFrom(a);
                    x142 = x143;
                } catch (IOException e2) {
                    Log.printErrStackTrace("HABBYGE-MALI.SessionPairDao", e2, "SessionPair, _read: %s", e2.getMessage());
                }
            }
        }
        if (x142 != null && x142.f354530h) {
            C22505ka3 ka32 = x142.f354526d;
            String b = C115411b.m162219b(ka32.f64087d);
            if (b != null) {
                C22505ka3 c = C16777c.m16411c(ka32, b + "_" + j, j);
                C118427eg2 b2 = C116711b.m164577b(ka32.f64087d);
                if (b2 != null) {
                    Log.m105925i("HABBYGE-MALI.VoipFloatSession", "restoreLastSesssion, curPage: %s, %s", b2.f353969d, b2.f353972g);
                    C113264b.m155056b(c, b2.f353969d, b2.f353977o, j);
                }
                String b3 = C16780k.m16423b();
                if (b3 == null) {
                    b3 = "";
                }
                c.f64102v = b3;
                C16777c.m16409a(c);
                C23462b.m28021f().mo36932s(c);
            }
        }
    }
}
