package x22;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import java.util.ArrayList;
import t22.C77832s;
import x22.C112028i;
import x22.C118796l;
import y22.C118913e;

/* renamed from: x22.j */
public class C112033j implements C112028i.C112032c, C118796l.C112037f {

    /* renamed from: a */
    public ViewGroup f335371a;

    /* renamed from: b */
    public View f335372b;

    /* renamed from: c */
    public Context f335373c;

    /* renamed from: d */
    public C112028i f335374d;

    /* renamed from: e */
    public C112035k f335375e;

    /* renamed from: f */
    public ArrayList<String> f335376f;

    /* renamed from: g */
    public String f335377g = "";

    /* renamed from: h */
    public String f335378h = "";

    /* renamed from: i */
    public boolean f335379i = false;

    /* renamed from: j */
    public C118913e f335380j;

    /* renamed from: k */
    public C112034a f335381k;

    /* renamed from: x22.j$a */
    public interface C112034a {
    }

    public C112033j(Context context, ViewGroup viewGroup, View view, String str, C118913e eVar) {
        this.f335371a = viewGroup;
        this.f335372b = view;
        this.f335373c = context;
        this.f335376f = new ArrayList<>();
        this.f335378h = str;
        this.f335380j = eVar;
        Log.m105919d("MicroMsg.ShareHeaderMgr", "init ShareHeaderMgr, roomname=%s", str);
        C112028i iVar = new C112028i(this.f335373c, this.f335372b, this.f335378h);
        this.f335374d = iVar;
        iVar.f335363g = this;
        this.f335375e = new C112035k(this.f335373c, this.f335371a, this.f335378h);
        for (String add : C77832s.Bx0().mo107950c(this.f335378h)) {
            this.f335376f.add(add);
        }
    }

    /* renamed from: a */
    public void mo163751a(String str) {
        Log.m105919d("MicroMsg.ShareHeaderMgr", "onCurTalkerChange, username = %s", str);
        if (!this.f335379i) {
            this.f335377g = str;
            C112028i iVar = this.f335374d;
            iVar.getClass();
            Log.m105925i("MicroMsg.ShareHeaderAvatarViewMgr", "onCurMemberChange, username=%s", str);
            if (Util.isNullOrNil(str)) {
                iVar.mo163742c();
            } else {
                iVar.mo163742c();
                iVar.mo163740a(str);
            }
            C112035k kVar = this.f335375e;
            String str2 = this.f335377g;
            kVar.getClass();
            Log.m105919d("MicroMsg.ShareHeaderMsgMgr", "onCurMemberChange, curMember=%s", str2);
            if (!Util.isNullOrNil(str2)) {
                if (!Util.isNullOrNil(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2))) {
                    kVar.f335392k = true;
                    kVar.f335394m.removeMessages(5);
                    Message obtain = Message.obtain();
                    obtain.what = 5;
                    obtain.obj = str2;
                    kVar.f335394m.sendMessageAtFrontOfQueue(obtain);
                }
                kVar.mo163753c(true);
            } else {
                kVar.f335392k = false;
                kVar.f335394m.removeMessages(10);
                Message obtain2 = Message.obtain();
                obtain2.what = 10;
                kVar.f335394m.sendMessage(obtain2);
                kVar.mo163753c(true);
            }
            Object viewByItag = this.f335380j.getViewByItag(this.f335377g);
            if (viewByItag instanceof TrackPoint) {
                ((TrackPoint) viewByItag).mo175555c();
            }
        }
    }

    /* renamed from: b */
    public void mo163752b() {
        Log.m105924i("MicroMsg.ShareHeaderMgr", "onMyselfFinishTalking");
        C112028i iVar = this.f335374d;
        String s = C75592q0.m90789s();
        iVar.getClass();
        Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberFinishTalking, username=%s", s);
        if (iVar.f335360d.mo163744b(s)) {
            iVar.f335360d.mo163743a(s).mo163749a();
            iVar.f335360d.notifyDataSetChanged();
            iVar.f335357a.invalidate();
        }
        C112035k kVar = this.f335375e;
        kVar.getClass();
        Log.m105918d("MicroMsg.ShareHeaderMsgMgr", "onMyselfFinishTalking");
        kVar.f335394m.removeMessages(9);
        kVar.f335394m.removeMessages(10);
        Message obtain = Message.obtain();
        obtain.what = 9;
        kVar.f335394m.sendMessage(obtain);
        this.f335377g = "";
        this.f335379i = false;
    }
}
