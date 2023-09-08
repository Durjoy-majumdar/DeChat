package x22;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import t22.C77832s;

/* renamed from: x22.k */
public class C112035k {

    /* renamed from: a */
    public TextView f335382a;

    /* renamed from: b */
    public Context f335383b;

    /* renamed from: c */
    public ArrayList<String> f335384c;

    /* renamed from: d */
    public String f335385d;

    /* renamed from: e */
    public boolean f335386e = true;

    /* renamed from: f */
    public int f335387f = Color.parseColor("#44FEBB");

    /* renamed from: g */
    public int f335388g = Color.parseColor("#FFFFFF");

    /* renamed from: h */
    public int f335389h = Color.parseColor("#E54646");

    /* renamed from: i */
    public int f335390i = Color.parseColor("#FFC90C");

    /* renamed from: j */
    public boolean f335391j = false;

    /* renamed from: k */
    public boolean f335392k = false;

    /* renamed from: l */
    public String f335393l = "";

    /* renamed from: m */
    public MMHandler f335394m = new C112036a(Looper.getMainLooper());

    /* renamed from: x22.k$a */
    public class C112036a extends MMHandler {
        public C112036a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Class cls = C75339i.class;
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    C112035k kVar = C112035k.this;
                    kVar.f335382a.setText(kVar.f335393l);
                    return;
                case 2:
                    Log.m105919d("MicroMsg.ShareHeaderMsgMgr", "update member num, isMyselfTalking=%b, isOtherTalking=%b", Boolean.valueOf(C112035k.this.f335391j), Boolean.valueOf(C112035k.this.f335392k));
                    C112035k kVar2 = C112035k.this;
                    if (!kVar2.f335391j && !kVar2.f335392k) {
                        kVar2.f335382a.setTextColor(kVar2.f335388g);
                        kVar2.f335382a.invalidate();
                        int intValue = ((Integer) message.obj).intValue();
                        if (intValue == 0) {
                            C112035k kVar3 = C112035k.this;
                            kVar3.f335382a.setText(kVar3.f335383b.getString(C0966R.string.k5k));
                            return;
                        }
                        C112035k kVar4 = C112035k.this;
                        kVar4.f335382a.setText(kVar4.f335383b.getResources().getQuantityString(C0966R.plurals.f7252a_, intValue, new Object[]{Integer.valueOf(intValue)}));
                        return;
                    }
                    return;
                case 3:
                    C112035k kVar5 = C112035k.this;
                    if (kVar5.f335392k || kVar5.f335391j) {
                        removeMessages(3);
                        Message obtain = Message.obtain();
                        obtain.what = 3;
                        obtain.obj = message.obj;
                        sendMessage(obtain);
                        return;
                    }
                    kVar5.f335393l = kVar5.f335382a.getText().toString();
                    C112035k.m152771a(C112035k.this);
                    String displayName = ((C75339i) C86312j.m106911c(cls)).getDisplayName((String) message.obj);
                    C112035k kVar6 = C112035k.this;
                    kVar6.f335382a.setText(kVar6.f335383b.getString(C0966R.string.k5q, new Object[]{displayName}));
                    C112035k kVar7 = C112035k.this;
                    if (kVar7.f335391j || kVar7.f335392k) {
                        C112035k.m152772b(kVar7, true);
                        return;
                    }
                    return;
                case 4:
                    C112035k kVar8 = C112035k.this;
                    if (kVar8.f335392k || kVar8.f335391j) {
                        removeMessages(4);
                        Message obtain2 = Message.obtain();
                        obtain2.what = 4;
                        obtain2.obj = message.obj;
                        sendMessage(obtain2);
                        return;
                    }
                    kVar8.f335393l = kVar8.f335382a.getText().toString();
                    C112035k.m152771a(C112035k.this);
                    String displayName2 = ((C75339i) C86312j.m106911c(cls)).getDisplayName((String) message.obj);
                    C112035k kVar9 = C112035k.this;
                    kVar9.f335382a.setText(kVar9.f335383b.getString(C0966R.string.k5r, new Object[]{displayName2}));
                    C112035k kVar10 = C112035k.this;
                    if (kVar10.f335391j || kVar10.f335392k) {
                        C112035k.m152772b(kVar10, true);
                        return;
                    }
                    return;
                case 5:
                    C112035k kVar11 = C112035k.this;
                    kVar11.f335392k = true;
                    kVar11.f335391j = false;
                    C112035k.m152771a(kVar11);
                    String displayName3 = ((C75339i) C86312j.m106911c(cls)).getDisplayName((String) message.obj);
                    C112035k kVar12 = C112035k.this;
                    kVar12.f335382a.setText(kVar12.f335383b.getString(C0966R.string.k5s, new Object[]{displayName3}));
                    return;
                case 6:
                    C112035k kVar13 = C112035k.this;
                    kVar13.f335391j = true;
                    kVar13.f335392k = false;
                    C112035k.m152771a(kVar13);
                    C112035k kVar14 = C112035k.this;
                    kVar14.f335382a.setText(kVar14.f335383b.getString(C0966R.string.k5p));
                    return;
                case 7:
                    C112035k kVar15 = C112035k.this;
                    kVar15.f335392k = true;
                    kVar15.f335382a.setTextColor(kVar15.f335389h);
                    kVar15.f335382a.invalidate();
                    C112035k kVar16 = C112035k.this;
                    kVar16.f335382a.setText(kVar16.f335383b.getString(C0966R.string.k5u));
                    C112035k kVar17 = C112035k.this;
                    kVar17.f335393l = kVar17.f335382a.getText().toString();
                    C112035k.m152772b(C112035k.this, true);
                    return;
                case 8:
                    C112035k kVar18 = C112035k.this;
                    kVar18.f335382a.setTextColor(kVar18.f335390i);
                    kVar18.f335382a.invalidate();
                    C112035k kVar19 = C112035k.this;
                    kVar19.f335382a.setText(kVar19.f335383b.getString(C0966R.string.k5v));
                    return;
                case 9:
                    C112035k kVar20 = C112035k.this;
                    kVar20.f335391j = false;
                    if (!kVar20.f335392k) {
                        kVar20.mo163753c(true);
                        return;
                    }
                    return;
                case 10:
                    C112035k kVar21 = C112035k.this;
                    kVar21.f335392k = false;
                    kVar21.mo163753c(false);
                    return;
                default:
                    return;
            }
        }
    }

    public C112035k(Context context, ViewGroup viewGroup, String str) {
        this.f335383b = context;
        this.f335382a = (TextView) viewGroup.findViewById(C0966R.C0970id.knx);
        this.f335385d = str;
        Log.m105918d("MicroMsg.ShareHeaderMsgMgr", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f335382a.invalidate();
        this.f335384c = new ArrayList<>();
        for (String add : C77832s.Bx0().mo107950c(this.f335385d)) {
            this.f335384c.add(add);
        }
        mo163753c(false);
    }

    /* renamed from: a */
    public static void m152771a(C112035k kVar) {
        kVar.f335382a.setTextColor(kVar.f335387f);
        kVar.f335382a.invalidate();
    }

    /* renamed from: b */
    public static void m152772b(C112035k kVar, boolean z) {
        kVar.f335394m.removeMessages(1);
        Message obtain = Message.obtain();
        obtain.what = 1;
        if (z) {
            kVar.f335394m.sendMessageDelayed(obtain, 100);
        } else {
            kVar.f335394m.sendMessage(obtain);
        }
    }

    /* renamed from: c */
    public final void mo163753c(boolean z) {
        this.f335394m.removeMessages(2);
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = Integer.valueOf(this.f335384c.size());
        Log.m105919d("MicroMsg.ShareHeaderMsgMgr", "updateMemberCount, size=%d, isDelay=%b", Integer.valueOf(this.f335384c.size()), Boolean.valueOf(z));
        if (z) {
            this.f335394m.sendMessageDelayed(obtain, 100);
        } else {
            this.f335394m.sendMessage(obtain);
        }
    }
}
