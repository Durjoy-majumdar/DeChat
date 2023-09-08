package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMConditionVariable;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import gv0.C20849e;
import gv0.C20851g;
import gv0.e$$d;
import java.util.LinkedList;
import java.util.Vector;
import oa1.C117731d;
import te3.C77926f9;
import yu0.C23367h;

/* renamed from: zu0.s */
public class C23589s {

    /* renamed from: a */
    public final C23584k f67670a;

    /* renamed from: b */
    public String f67671b;

    /* renamed from: c */
    public String f67672c;

    /* renamed from: d */
    public String f67673d;

    /* renamed from: e */
    public int f67674e;

    /* renamed from: f */
    public long f67675f = 0;

    /* renamed from: g */
    public long f67676g = 0;

    /* renamed from: h */
    public String f67677h;

    /* renamed from: i */
    public Vector<C77926f9> f67678i;

    /* renamed from: j */
    public MMConditionVariable f67679j;

    /* renamed from: k */
    public long f67680k;

    /* renamed from: l */
    public final e$$d f67681l;

    public C23589s(C23584k kVar, C23367h hVar) {
        String str;
        Class cls = C75339i.class;
        String str2 = "";
        this.f67671b = str2;
        this.f67677h = str2;
        this.f67678i = new Vector<>();
        this.f67679j = new MMConditionVariable(true);
        this.f67680k = (long) C117731d.m166007c().mo182443e("clicfg_backup_send_cache_size", 31457280, false, true);
        this.f67681l = new s$$b(this);
        this.f67670a = kVar;
        String str3 = hVar.f67132a;
        this.f67672c = str3;
        this.f67674e = hVar.f67135d;
        if (C72996z1.m85820U5(str3)) {
            String str4 = this.f67672c;
            str = ((C75339i) C86312j.m106911c(cls)).mo62519pb(str4, str4);
        } else {
            str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(this.f67672c);
        }
        this.f67673d = str;
        if (Util.isNullOrNil(str)) {
            String str5 = this.f67671b;
            Object[] objArr = new Object[2];
            String str6 = this.f67673d;
            objArr[0] = str6 != null ? str6 : str2;
            objArr[1] = this.f67672c;
            Log.m105921e(str5, "TagProcessor nickName is NullOrNil! nickName:%s, talker:%s", objArr);
            this.f67673d = this.f67672c;
        }
        String str7 = "MicroMsg.BackupPackAndSend.tag." + this.f67674e + "." + this.f67673d;
        this.f67671b = str7;
        Log.m105925i(str7, "initTagNow [%d,%s,%s] [%s]", Integer.valueOf(this.f67674e), this.f67673d, this.f67672c, MMStack.getCaller());
    }

    /* renamed from: a */
    public void mo37060a() {
        this.f67677h = "MSG_" + this.f67678i.size() + "_" + this.f67672c + "_" + Util.nowMilliSecond();
        Log.m105925i(this.f67671b, "chatMsgList:%d", Integer.valueOf(this.f67678i.size()));
        e$$d e__d = this.f67681l;
        s$$c s__c = new s$$c(this);
        String str = this.f67677h;
        LinkedList linkedList = new LinkedList(this.f67678i);
        byte[] bArr = this.f67670a.f67615d.f303746f;
        int i = C20849e.f58894A;
        C23584k.f67611q.mo37041a(new C20851g(s__c, linkedList, e__d, str, bArr), ((long) linkedList.size()) * 10240);
        this.f67678i = new Vector<>();
    }

    /* renamed from: b */
    public void mo37061b(C23588r rVar) {
        if (this.f67678i.size() > 0) {
            mo37060a();
        }
        String str = this.f67677h;
        String str2 = this.f67671b;
        C23587q qVar = new C23587q(str2, this.f67670a, this.f67672c, this.f67674e, this.f67675f, this.f67676g, str, this.f67673d, rVar);
        this.f67676g = 0;
        this.f67675f = 0;
        Log.m105925i(str2, "setTagEnd tagTextClientId:%s, index:%d", str, Long.valueOf(C23584k.f67611q.f67601b.get()));
        C23583j jVar = C23584k.f67611q;
        s$$a s__a = new s$$a(qVar);
        jVar.getClass();
        jVar.mo37041a(new C23582i(s__a), 0);
    }

    public String toString() {
        return this.f67671b;
    }
}
