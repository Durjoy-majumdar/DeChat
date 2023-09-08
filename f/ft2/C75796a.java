package ft2;

import android.database.Cursor;
import android.view.View;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import ms2.C61579p;
import p922vj.C78420a;

/* renamed from: ft2.a */
public class C75796a extends C74526m1 {

    /* renamed from: n */
    public Cursor f222412n = null;

    /* renamed from: o */
    public List<C61579p> f222413o = null;

    /* renamed from: p */
    public List<String> f222414p = new ArrayList();

    /* renamed from: q */
    public final boolean f222415q;

    /* renamed from: r */
    public View.OnClickListener f222416r = null;

    public C75796a(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, boolean z3) {
        super(mMBaseSelectContactUI, list, z, true);
        this.f222415q = z3;
        Log.m105924i("MicroMsg.SnsChatRoomAdapter", "create!");
        mo7853r();
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        int size = ((ArrayList) this.f222414p).size();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return size;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: gt2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: gl3.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: gl3.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: gt2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: gt2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: gt2.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gl3.C75922b mo7850h(int r6) {
        /*
            r5 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r1 = "createDataItem"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.List<java.lang.String> r3 = r5.f222414p
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "recent_use"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            if (r4 == 0) goto L_0x003d
            java.lang.String r0 = "createRecentUseHeaderDataItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            gl3.r r3 = new gl3.r
            r3.<init>(r6)
            com.tencent.mm.ui.contact.g1 r6 = r5.f219055d
            android.app.Activity r6 = r6.getActivity()
            android.content.res.Resources r6 = r6.getResources()
            r4 = 2131837001(0x7f114049, float:1.9307185E38)
            java.lang.String r6 = r6.getString(r4)
            r3.f222731x = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x00a3
        L_0x003d:
            java.lang.String r4 = "recent"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            if (r4 == 0) goto L_0x0067
            java.lang.String r0 = "createRecentHeaderDataItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            gl3.r r3 = new gl3.r
            r3.<init>(r6)
            com.tencent.mm.ui.contact.g1 r6 = r5.f219055d
            android.app.Activity r6 = r6.getActivity()
            android.content.res.Resources r6 = r6.getResources()
            r4 = 2131837000(0x7f114048, float:1.9307183E38)
            java.lang.String r6 = r6.getString(r4)
            r3.f222731x = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x00a3
        L_0x0067:
            f40.C86709a0.m107528h()
            k40.a r4 = f40.C86709a0.m107533q(r0)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r4 = r4.mo69674W2(r3)
            if (r4 != 0) goto L_0x008b
            f40.C86709a0.m107528h()
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r4 = r0.mo69656H3(r3)
        L_0x008b:
            java.lang.String r0 = "createSnsChatRoomDataItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            gt2.a r3 = new gt2.a
            r3.<init>(r6)
            android.view.View$OnClickListener r6 = r5.f222416r
            r3.f222915D = r6
            r3.mo106181j(r4)
            boolean r6 = r5.f219057f
            r3.f222608e = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x00a3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ft2.C75796a.mo7850h(int):gl3.b");
    }

    /* renamed from: r */
    public void mo7853r() {
        Class cls = C75700k0.class;
        SnsMethodCalculate.markStartTimeMs("resetData", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        Log.m105924i("MicroMsg.SnsChatRoomAdapter", "resetData");
        this.f222413o = C94866e1.gy0().mo131195f().f175148e;
        Cursor cursor = this.f222412n;
        if (cursor != null) {
            cursor.close();
            this.f222412n = null;
        }
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
        List<String> list = this.f219096j;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        this.f222412n = ((C44660i2) Ku).mo69747R(5, list, (String) null, this.f219095i, "");
        mo103564g();
        if (!Util.isNullOrNil((List) this.f222413o)) {
            for (C61579p next : this.f222413o) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(next.f175150d);
                if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                    this.f222414p.add(next.f175150d);
                }
            }
        }
        if (!Util.isNullOrNil((List) this.f222414p)) {
            this.f222414p.add(0, "recent_use");
            this.f222414p.add("recent");
        } else {
            this.f222414p.add(0, "recent");
        }
        while (this.f222412n.moveToNext()) {
            Cursor cursor2 = this.f222412n;
            String string = cursor2.getString(cursor2.getColumnIndex("username"));
            if (!this.f222414p.contains(string)) {
                SnsMethodCalculate.markStartTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                boolean z = true;
                if (!this.f222415q) {
                    SnsMethodCalculate.markEndTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                } else {
                    z = true ^ C45628s0.m50735A(string);
                    SnsMethodCalculate.markEndTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                }
                if (z) {
                    this.f222414p.add(string);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("resetData", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
    }
}
