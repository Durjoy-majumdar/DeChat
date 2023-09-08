package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.ipcall.C105379e;
import com.tencent.p014mm.plugin.ipcall.IPCallManager;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import j12.C108528a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l12.C109123c;
import l12.C109128f;
import l12.C109129g;
import nj3.C76879j;
import p196ln.C76708i;
import p206nj.C11171e;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.i2 */
public class C105420i2 implements C105379e, C108528a.C108529a {

    /* renamed from: A */
    public long f313422A;

    /* renamed from: B */
    public long f313423B = -1;

    /* renamed from: C */
    public boolean f313424C = false;

    /* renamed from: D */
    public boolean f313425D = true;

    /* renamed from: E */
    public boolean f313426E = false;

    /* renamed from: F */
    public boolean f313427F = false;

    /* renamed from: a */
    public EditText f313428a;

    /* renamed from: b */
    public TextView f313429b;

    /* renamed from: c */
    public TextView f313430c;

    /* renamed from: d */
    public ImageView f313431d;

    /* renamed from: e */
    public ImageView f313432e;

    /* renamed from: f */
    public IPCallFuncButton f313433f;

    /* renamed from: g */
    public IPCallFuncButton f313434g;

    /* renamed from: h */
    public IPCallFuncButton f313435h;

    /* renamed from: i */
    public ImageButton f313436i;

    /* renamed from: j */
    public DialPad f313437j;

    /* renamed from: k */
    public TextView f313438k;

    /* renamed from: l */
    public View f313439l;

    /* renamed from: m */
    public ImageButton f313440m;

    /* renamed from: n */
    public String f313441n;

    /* renamed from: o */
    public String f313442o;

    /* renamed from: p */
    public int f313443p = -1;

    /* renamed from: q */
    public String f313444q;

    /* renamed from: r */
    public String f313445r;

    /* renamed from: s */
    public String f313446s;

    /* renamed from: t */
    public String f313447t;

    /* renamed from: u */
    public int f313448u;

    /* renamed from: v */
    public int f313449v;

    /* renamed from: w */
    public IPCallTalkUI f313450w;

    /* renamed from: x */
    public Bitmap f313451x;

    /* renamed from: y */
    public IPCallManager f313452y;

    /* renamed from: z */
    public C105422b f313453z;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.i2$a */
    public class C105421a implements DialogInterface.OnClickListener {
        public C105421a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C105420i2.this.f313450w.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.i2$b */
    public interface C105422b {
    }

    public C105420i2(IPCallTalkUI iPCallTalkUI) {
        this.f313450w = iPCallTalkUI;
        IPCallManager iPCallManager = C105385g.xx0().f313271i;
        this.f313452y = iPCallManager;
        iPCallManager.f313219d = this;
    }

    /* renamed from: a */
    public final void mo150159a() {
        C105385g.yx0().f326761e = this.f313450w;
        C109123c yx02 = C105385g.yx0();
        C109129g gVar = yx02.f326757a;
        gVar.f326777h = yx02;
        if (!gVar.f326773d.hasRegistered()) {
            gVar.f326773d.setSensorCallBack(gVar);
            if (gVar.f326774e.startShake(new C109128f(gVar))) {
                gVar.f326775f = 0;
            } else {
                gVar.f326775f = -1;
            }
        }
        C108528a aVar = C105385g.yx0().f326758b;
        if (aVar != null) {
            aVar.f324867l = this;
        }
        C105385g.yx0().f326760d = this;
        C105385g.xx0().f313271i.mo150058a(false);
    }

    /* renamed from: b */
    public void mo150160b() {
        TextView textView = this.f313438k;
        if (textView != null) {
            textView.setVisibility(4);
        }
        View view = this.f313439l;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "dismissNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "dismissNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public final void mo150161c() {
        Bitmap bitmap = null;
        this.f313428a.setKeyListener((KeyListener) null);
        this.f313428a.setHorizontallyScrolling(true);
        this.f313437j.setVisibility(4);
        this.f313437j.setTalkUIMode(true);
        Class cls = C76708i.class;
        if (!Util.isNullOrNil(this.f313447t)) {
            mo150166h(this.f313447t);
        }
        if (C11171e.m11046c(16)) {
            this.f313428a.setTypeface(Typeface.create("sans-serif-light", 0));
            this.f313429b.setTypeface(Typeface.create("sans-serif-light", 0));
        }
        if (!Util.isNullOrNil(this.f313444q)) {
            this.f313451x = C13818a.m13109e(this.f313450w, this.f313444q, true);
        }
        if (this.f313451x == null && !Util.isNullOrNil(this.f313442o) && C13818a.m13105a()) {
            IPCallTalkUI iPCallTalkUI = this.f313450w;
            String str = this.f313442o;
            String f = C13818a.m13110f(iPCallTalkUI, str);
            if (!Util.isNullOrNil(f)) {
                bitmap = C13818a.m13109e(iPCallTalkUI, f, true);
            }
            if (bitmap == null && C13818a.m13105a()) {
                String k = C13818a.m13115k(str);
                Log.m105919d("MicroMsg.IPCallAddressUtil", "getAvatarByPhoneNumber, username: %s", k);
                if (!Util.isNullOrNil(k)) {
                    bitmap = ((C76708i) C86312j.m106911c(cls)).mo106846sO(k, C0947jz.f2205e, C0947jz.f2205e, 4);
                }
            }
            this.f313451x = bitmap;
        }
        if (this.f313451x == null && !Util.isNullOrNil(this.f313446s)) {
            this.f313451x = ((C76708i) C86312j.m106911c(cls)).mo106846sO(this.f313446s, 480, 480, 4);
        }
        if (this.f313451x == null) {
            this.f313431d.setVisibility(0);
            this.f313432e.setVisibility(8);
        }
        if (this.f313451x != null) {
            this.f313431d.setVisibility(8);
            this.f313432e.setVisibility(0);
            this.f313432e.setImageBitmap(this.f313451x);
        }
        this.f313440m.setOnClickListener(new C105424j2(this));
        this.f313435h.setClickCallback(new C105426k2(this));
        this.f313433f.setClickCallback(new C105428l2(this));
        this.f313434g.setClickCallback(new C105429m2(this));
        this.f313436i.setOnClickListener(new C105430n2(this));
        this.f313437j.setDialButtonClickListener(new C105400c2(this));
    }

    /* renamed from: d */
    public void mo150162d(boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.TalkUIController", "onBluetoothPlugStateChange, isPlugged: %b", Boolean.valueOf(z));
        if (!C105385g.Fx0().mo150084b()) {
            return;
        }
        if (z) {
            boolean a = this.f313435h.mo150113a();
            C108528a wx02 = C105385g.wx0();
            if (wx02 != null) {
                wx02.f324873r = a;
            }
            C105385g.yx0().mo160364b(false);
            this.f313435h.setEnable(false);
            Object[] objArr = new Object[1];
            C108528a wx03 = C105385g.wx0();
            objArr[0] = Boolean.valueOf(wx03 != null ? wx03.f324873r : false);
            Log.m105925i("MicroMsg.TalkUIController", "mBluetoothResumeSpeaker:%s", objArr);
            return;
        }
        C109123c yx02 = C105385g.yx0();
        C108528a wx04 = C105385g.wx0();
        yx02.mo160364b(wx04 != null ? wx04.f324873r : false);
        this.f313435h.setEnable(true);
        IPCallFuncButton iPCallFuncButton = this.f313435h;
        C108528a wx05 = C105385g.wx0();
        if (wx05 != null) {
            z2 = wx05.f324873r;
        }
        iPCallFuncButton.setChecked(z2);
    }

    /* renamed from: e */
    public void mo150163e(boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.TalkUIController", "onHeadsetPlugStateChange, isPlugged: %b", Boolean.valueOf(z));
        if (!C105385g.Fx0().mo150084b()) {
            return;
        }
        if (z) {
            boolean a = this.f313435h.mo150113a();
            C108528a wx02 = C105385g.wx0();
            if (wx02 != null) {
                wx02.f324872q = a;
            }
            C105385g.yx0().mo160364b(false);
            this.f313435h.setEnable(false);
            Object[] objArr = new Object[1];
            C108528a wx03 = C105385g.wx0();
            objArr[0] = Boolean.valueOf(wx03 != null ? wx03.f324872q : false);
            Log.m105925i("MicroMsg.TalkUIController", "mHeadsetResumeSpeaker:%s", objArr);
            return;
        }
        C109123c yx02 = C105385g.yx0();
        C108528a wx04 = C105385g.wx0();
        yx02.mo160364b(wx04 != null ? wx04.f324872q : false);
        this.f313435h.setEnable(true);
        IPCallFuncButton iPCallFuncButton = this.f313435h;
        C108528a wx05 = C105385g.wx0();
        if (wx05 != null) {
            z2 = wx05.f324872q;
        }
        iPCallFuncButton.setChecked(z2);
    }

    /* renamed from: f */
    public void mo150164f() {
        Log.m105918d("MicroMsg.TalkUIController", "onUserAccept");
        if (C105385g.Fx0().mo150084b()) {
            boolean a = this.f313435h.mo150113a();
            C108528a wx02 = C105385g.wx0();
            if (wx02 != null) {
                wx02.f324872q = a;
            }
            boolean a2 = this.f313435h.mo150113a();
            C108528a wx03 = C105385g.wx0();
            if (wx03 != null) {
                wx03.f324873r = a2;
            }
            C105385g.yx0().mo160364b(this.f313435h.mo150113a());
        }
        if (C105385g.Fx0().f313245a == 5) {
            C105385g.yx0().f326758b.f324869n.mo160366b(this.f313433f.mo150113a());
        }
    }

    /* renamed from: g */
    public void mo150165g(int i) {
        String str;
        if (i == 3) {
            int i2 = C105385g.Gx0().f313260u.f325915t;
            Context context = MMApplicationContext.getContext();
            if ((i2 & 1) > 0 && (i2 & 2) <= 0) {
                str = context.getString(C0966R.string.fxd) + " ";
            } else if ((i2 & 8) > 0) {
                str = context.getString(C0966R.string.fxe) + " ";
            } else {
                str = "";
            }
            int i3 = this.f313443p;
            if (i3 != -1) {
                String o = C13818a.m13119o(i3);
                this.f313430c.setText(str + this.f313450w.getString(C0966R.string.fvj, new Object[]{o}));
                return;
            }
            this.f313430c.setText(str + this.f313450w.getString(C0966R.string.fvi));
        } else if (i == 5) {
            this.f313430c.setText(String.format("%02d:%02d", new Object[]{Long.valueOf(this.f313422A / 60), Long.valueOf(this.f313422A % 60)}));
        } else if (i == 10) {
            this.f313430c.setText(C0966R.string.fvm);
        }
    }

    /* renamed from: h */
    public final void mo150166h(String str) {
        if (!Util.isNullOrNil(this.f313441n)) {
            mo150167i(this.f313441n, C13818a.m13108d(str));
        } else {
            mo150167i(C13818a.m13108d(str), "");
        }
    }

    /* renamed from: i */
    public final void mo150167i(String str, String str2) {
        this.f313428a.setText(str);
        if (!Util.isNullOrNil(str)) {
            EditText editText = this.f313428a;
            editText.setSelection(editText.getText().length() - 1);
        }
        this.f313429b.setText(str2);
    }

    /* renamed from: j */
    public final void mo150168j(String str, String str2, int i, String str3) {
        String str4;
        mo150160b();
        if (Util.isNullOrNil(str)) {
            if (Util.isNullOrNil(str3)) {
                str = this.f313450w.getString(C0966R.string.fts);
            } else {
                str4 = str3;
                if (2 != i && str2 != null) {
                    this.f313430c.setText(str2);
                    return;
                } else if (1 == i && str2 != null) {
                    IPCallTalkUI iPCallTalkUI = this.f313450w;
                    C76879j.m92711E(iPCallTalkUI, str2, str4, iPCallTalkUI.getString(C0966R.string.ftt), false, new C105421a());
                    return;
                }
            }
        }
        str4 = str;
        if (2 != i) {
        }
        if (1 == i) {
        }
    }

    /* renamed from: k */
    public final void mo150169k(int i) {
        ((MMNotification) C97625j3.m125816f()).mo93207e(42);
        C105422b bVar = this.f313453z;
        if (bVar != null) {
            IPCallTalkUI iPCallTalkUI = (IPCallTalkUI) bVar;
            if (this.f313425D) {
                MMHandlerThread.postToMainThreadDelayed(new C105431u1(iPCallTalkUI), 3000);
            }
        }
    }
}
