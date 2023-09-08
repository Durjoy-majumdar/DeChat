package ev1;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import java.util.HashMap;
import jq3.C60905o;
import jq3.C9493c;
import p687sr.C64159i;

/* renamed from: ev1.a */
public abstract class C58838a implements C9493c {

    /* renamed from: g */
    public static final HashMap<String, C31722a> f168433g = new HashMap<>();

    /* renamed from: d */
    public final String f168434d;

    /* renamed from: e */
    public long f168435e;

    /* renamed from: f */
    public final Runnable f168436f;

    /* renamed from: ev1.a$a */
    public static final class C31722a {

        /* renamed from: a */
        public String f84707a;

        /* renamed from: b */
        public String f84708b;

        /* renamed from: c */
        public boolean f84709c;

        public C31722a(String str, String str2, boolean z) {
            C87412m.m108594g(str, "id");
            C87412m.m108594g(str2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f84707a = str;
            this.f84708b = str2;
            this.f84709c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31722a)) {
                return false;
            }
            C31722a aVar = (C31722a) obj;
            return C87412m.m108589b(this.f84707a, aVar.f84707a) && C87412m.m108589b(this.f84708b, aVar.f84708b) && this.f84709c == aVar.f84709c;
        }

        public int hashCode() {
            int hashCode = ((this.f84707a.hashCode() * 31) + this.f84708b.hashCode()) * 31;
            boolean z = this.f84709c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "MsgState(id=" + this.f84707a + ", token=" + this.f84708b + ", isExposing=" + this.f84709c + ')';
        }
    }

    /* renamed from: ev1.a$b */
    public static final class C58839b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58838a f168437d;

        public C58839b(C58838a aVar) {
            this.f168437d = aVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f168437d.f168434d + " timeout, removeSelf!");
            ((C64159i) C86312j.m106911c(C64159i.class)).sq0().mo84686b(this.f168437d.f168434d);
        }
    }

    public C58838a(String str, long j) {
        String str2;
        C87412m.m108594g(str, "id");
        this.f168434d = str;
        this.f168435e = j;
        this.f168436f = new C58839b(this);
        HashMap<String, C31722a> hashMap = f168433g;
        C31722a aVar = hashMap.get(str);
        boolean z = aVar != null ? aVar.f84709c : false;
        C31722a aVar2 = hashMap.get(str);
        if (aVar2 == null || (str2 = aVar2.f84708b) == null) {
            str2 = str + "-removeSelf";
        }
        hashMap.put(str, new C31722a(str, str2, z));
    }

    /* renamed from: a */
    public int mo84032a() {
        return ((C64159i) C86312j.m106911c(C64159i.class)).sq0().mo84685a() ? MMApplicationContext.getColor(C0966R.color.f3482us) : MMApplicationContext.getColor(C0966R.color.f3479uo);
    }

    /* renamed from: b */
    public Drawable mo84033b() {
        return C87515a.m108835e(MMApplicationContext.getResources(), C0966R.raw.wechat_icon, 0.0f);
    }

    /* renamed from: d */
    public String mo84034d() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.f18);
        C87412m.m108593f(string, "getContext().getString(R.string.force_notify)");
        return string;
    }

    /* renamed from: f */
    public final boolean mo84035f() {
        C31722a aVar = f168433g.get(this.f168434d);
        if (aVar != null) {
            return aVar.f84709c;
        }
        return false;
    }

    /* renamed from: i */
    public abstract boolean mo84036i();

    /* renamed from: j */
    public abstract boolean mo84037j();

    /* renamed from: k */
    public void mo84038k() {
        Log.m105924i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f168434d + " onAddToList");
    }

    /* renamed from: l */
    public void mo84039l() {
    }

    /* renamed from: m */
    public void mo84040m() {
        Class cls = C64159i.class;
        if (!mo84035f()) {
            Log.m105924i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f168434d + " onExpose");
            String s = mo84046s();
            C31722a aVar = f168433g.get(this.f168434d);
            if (aVar != null) {
                aVar.f84709c = true;
            }
            ((C64159i) C86312j.m106911c(cls)).sq0().mo84688d(s);
            if (this.f168435e != 0) {
                ((C64159i) C86312j.m106911c(cls)).sq0().mo84690f(this.f168436f, this.f168435e, s);
            }
        }
    }

    /* renamed from: n */
    public abstract void mo84041n(View view);

    /* renamed from: o */
    public void mo84042o(boolean z) {
        if (mo84035f()) {
            Log.m105924i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f168434d + " onHide");
            C31722a aVar = f168433g.get(this.f168434d);
            if (aVar != null) {
                aVar.f84709c = false;
            }
            ((C64159i) C86312j.m106911c(C64159i.class)).sq0().mo84688d(mo84046s());
        }
    }

    /* renamed from: p */
    public abstract void mo84043p(C60905o oVar, View view, int i);

    /* renamed from: q */
    public void mo84044q() {
        Log.m105924i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f168434d + " onRemoveFromList");
        C31722a aVar = f168433g.get(this.f168434d);
        if (aVar != null) {
            aVar.f84709c = false;
        }
        ((C64159i) C86312j.m106911c(C64159i.class)).sq0().mo84688d(mo84046s());
    }

    /* renamed from: r */
    public void mo84045r() {
        Class cls = C64159i.class;
        Log.m105924i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f168434d + " onUpdateInList");
        String s = mo84046s();
        ((C64159i) C86312j.m106911c(cls)).sq0().mo84688d(s);
        if (mo84035f()) {
            ((C64159i) C86312j.m106911c(cls)).sq0().mo84690f(this.f168436f, this.f168435e, s);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.f84708b;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo84046s() {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, ev1.a$a> r0 = f168433g
            java.lang.String r1 = r2.f168434d
            java.lang.Object r0 = r0.get(r1)
            ev1.a$a r0 = (ev1.C58838a.C31722a) r0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.f84708b
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ev1.C58838a.mo84046s():java.lang.String");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C58838a(String str, long j, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? 0 : j);
    }
}
