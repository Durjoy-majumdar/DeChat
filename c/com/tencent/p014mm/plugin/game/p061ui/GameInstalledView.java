package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import kg3.C76577a;
import nd3.C47223a;
import p159gw.C45962f;
import p237sp.C13754y;
import p763ym.C79138l;
import ry1.C48127j0;
import sw1.C48483p;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameInstalledView */
public class GameInstalledView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: w */
    public static Map<String, Integer> f113977w = new HashMap();

    /* renamed from: x */
    public static int f113978x = 6;

    /* renamed from: y */
    public static int f113979y = 7;

    /* renamed from: d */
    public LinearLayout f113980d;

    /* renamed from: e */
    public ImageView f113981e;

    /* renamed from: f */
    public TextView f113982f;

    /* renamed from: g */
    public TextView f113983g;

    /* renamed from: h */
    public Context f113984h;

    /* renamed from: i */
    public LinkedList<C44561j> f113985i = new LinkedList<>();

    /* renamed from: j */
    public final DisplayMetrics f113986j = new DisplayMetrics();

    /* renamed from: n */
    public int f113987n = 4;

    /* renamed from: o */
    public int f113988o = 0;

    /* renamed from: p */
    public int f113989p = 0;

    /* renamed from: q */
    public int f113990q = 1;

    /* renamed from: r */
    public int f113991r = 999;

    /* renamed from: s */
    public C42204b f113992s;

    /* renamed from: t */
    public LinkedList<C42039b> f113993t;

    /* renamed from: u */
    public LinearLayout.LayoutParams f113994u = new LinearLayout.LayoutParams(-1, -2);

    /* renamed from: v */
    public C42091s.C42092a f113995v = new C42203a();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameInstalledView$a */
    public class C42203a implements C42091s.C42092a {
        public C42203a() {
        }

        /* renamed from: a */
        public void mo66052a(int i, String str, boolean z) {
            if (i == 3) {
                ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65971b(GameInstalledView.this.f113984h);
                GameInstalledView.this.mo66219b(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameInstalledView$b */
    public static class C42204b {

        /* renamed from: a */
        public String f113997a = "";

        /* renamed from: b */
        public String f113998b = "";

        /* renamed from: c */
        public String f113999c = "";
    }

    public GameInstalledView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113984h = context;
    }

    /* renamed from: a */
    public final void mo66218a(C44561j jVar) {
        String str = jVar.f149241I;
        String str2 = jVar.f149246N;
        String str3 = jVar.field_appId;
        C42091s sVar = C42091s.f113396a;
        if (!Util.isNullOrNil(str)) {
            C42091s.f113398c.put(str, new C42091s.C42093b(str2, 1002, str3, "", ""));
        }
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        nVar.f110176a = jVar.f149241I;
        nVar.f110179d = ((C79138l) C86312j.m106911c(C79138l.class)).mo74011hv(this.f113984h, jVar);
        nVar.f110182g = jVar.field_appId;
        nVar.f110180e = jVar.f149246N;
        nVar.f110184i = true;
        nVar.f110181f = 1;
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
    }

    /* renamed from: b */
    public void mo66219b(boolean z) {
        Class cls = C79138l.class;
        if (Util.isNullOrNil((List) this.f113993t)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (z) {
            this.f113985i = C42046d.m45749h(this.f113984h);
            if (!Util.isNullOrNil((List) this.f113993t) && !Util.isNullOrNil((List) this.f113985i)) {
                Iterator<C42039b> it = this.f113993t.iterator();
                while (it.hasNext()) {
                    C42039b next = it.next();
                    if (this.f113985i.contains(next)) {
                        this.f113985i.remove(next);
                        this.f113985i.addFirst(next);
                    }
                }
            }
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f113985i);
            LinkedList linkedList2 = new LinkedList();
            linkedList2.addAll(C42046d.m45749h(this.f113984h));
            LinkedList linkedList3 = new LinkedList();
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                C44561j jVar = (C44561j) it4.next();
                if (!linkedList2.contains(jVar) && !linkedList3.contains(jVar)) {
                    linkedList3.add(jVar);
                }
            }
            Iterator it5 = linkedList.iterator();
            while (it5.hasNext()) {
                C44561j jVar2 = (C44561j) it5.next();
                if (linkedList2.contains(jVar2)) {
                    linkedList2.remove(jVar2);
                } else if (!((C79138l) C86312j.m106911c(cls)).mo74016tz(this.f113984h, jVar2)) {
                    linkedList3.add(jVar2);
                }
            }
            if (linkedList2.size() > 0) {
                Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    C44561j jVar3 = (C44561j) it6.next();
                    if (!linkedList.contains(jVar3)) {
                        linkedList.addFirst(jVar3);
                    }
                }
            }
            if (linkedList3.size() > 0) {
                linkedList.removeAll(linkedList3);
            }
            LinkedList<C44561j> linkedList4 = new LinkedList<>();
            Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                linkedList4.add(((C79138l) C86312j.m106911c(cls)).getAppInfo(((C44561j) it7.next()).field_appId));
            }
            this.f113985i = linkedList4;
        }
        if (Util.isNullOrNil((List) this.f113985i)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f113980d.removeAllViews();
        this.f113988o = 0;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (this.f113985i.size() >= this.f113987n - 1) {
            f113979y = 7;
            f113978x = 6;
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f113984h, (float) 96);
            ((WindowManager) this.f113984h.getSystemService("window")).getDefaultDisplay().getMetrics(this.f113986j);
            DisplayMetrics displayMetrics = this.f113986j;
            int i = displayMetrics.widthPixels;
            int i2 = (int) (((float) (i * 160)) / ((float) displayMetrics.densityDpi));
            int i3 = ((i - 1) / fromDPToPix) + 1;
            this.f113987n = i3;
            if (i3 == 3) {
                f113979y = 3;
            }
            int i4 = f113978x;
            int i5 = (i4 << 1) + 84;
            int i6 = i4 + 6 + f113979y;
            int i7 = (i2 - 16) % i5;
            if (i7 < i6) {
                int i8 = i4 - 2;
                f113978x = i8;
                BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f113984h, (float) ((i8 << 1) + 84));
            } else if (i7 > i5 - i6) {
                int i9 = i4 + ((i7 - (i5 >> 1)) / i3);
                f113978x = i9;
                BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f113984h, (float) ((i9 << 1) + 84));
            }
        }
        this.f113994u.setMargins(BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f113984h, (float) f113978x), 0, BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f113984h, (float) f113978x), 0);
        Iterator<C44561j> it8 = this.f113985i.iterator();
        while (it8.hasNext()) {
            C44561j next2 = it8.next();
            View inflate = layoutInflater.inflate(C0966R.C0971layout.b1s, (ViewGroup) null);
            this.f113981e = (ImageView) inflate.findViewById(C0966R.C0970id.ekt);
            this.f113982f = (TextView) inflate.findViewById(C0966R.C0970id.emr);
            this.f113983g = (TextView) inflate.findViewById(C0966R.C0970id.eno);
            Bitmap ub = ((C79138l) C86312j.m106911c(cls)).mo74018ub(next2.field_appId, 1, C76577a.m92156g(this.f113984h));
            if (ub != null) {
                this.f113981e.setImageBitmap(ub);
            } else {
                this.f113981e.setImageResource(C0966R.C0969drawable.bdj);
            }
            this.f113982f.setText(((C79138l) C86312j.m106911c(cls)).mo74011hv(this.f113984h, next2));
            if (((C79138l) C86312j.m106911c(cls)).mo74016tz(this.f113984h, next2)) {
                int j = C52642c.m58992j(next2.field_packageName);
                if (f113977w.containsKey(next2.field_appId) && f113977w.get(next2.field_appId).intValue() > j) {
                    FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(next2.field_appId);
                    this.f113983g.setTextColor(this.f113984h.getResources().getColor(C0966R.color.f3525w9));
                    if (o.f12196f == 1) {
                        this.f113983g.setText(C0966R.string.f78);
                    } else {
                        this.f113983g.setText(C0966R.string.f77);
                    }
                } else if (!Util.isNullOrNil(next2.f149245M)) {
                    this.f113983g.setText(next2.f149245M);
                    this.f113983g.setTextColor(this.f113984h.getResources().getColor(C0966R.color.f3533wp));
                } else {
                    this.f113983g.setText("");
                }
            } else {
                this.f113983g.setTextColor(this.f113984h.getResources().getColor(C0966R.color.f3525w9));
                this.f113983g.setText(C0966R.string.f_b);
            }
            inflate.setTag(next2);
            inflate.setOnClickListener(this);
            this.f113980d.addView(inflate, this.f113994u);
        }
        C42204b bVar = this.f113992s;
        if (bVar != null && bVar.f113997a != null && bVar.f113998b != null) {
            View inflate2 = layoutInflater.inflate(C0966R.C0971layout.b1s, (ViewGroup) null);
            this.f113981e = (ImageView) inflate2.findViewById(C0966R.C0970id.ekt);
            this.f113982f = (TextView) inflate2.findViewById(C0966R.C0970id.emr);
            this.f113983g = (TextView) inflate2.findViewById(C0966R.C0970id.eno);
            C20828a b = C20828a.m22825b();
            String str = this.f113992s.f113997a;
            ImageView imageView = this.f113981e;
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59347c = true;
            b.mo32520i(str, imageView, bVar2.mo32666a(), new C48127j0(this, inflate2));
            this.f113982f.setText(this.f113992s.f113998b);
            this.f113983g.setVisibility(8);
            inflate2.setTag(this.f113992s);
            inflate2.setOnClickListener(this);
        }
    }

    public void onClick(View view) {
        int i;
        Class cls = C45962f.class;
        Class cls2 = C13754y.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof C44561j) {
            C44561j jVar = (C44561j) view.getTag();
            if (jVar == null || Util.isNullOrNil(jVar.field_appId)) {
                Log.m105920e("MicroMsg.GameInstalledView", "appinfo is null or appid is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (((C79138l) C86312j.m106911c(C79138l.class)).mo74016tz(this.f113984h, jVar)) {
                int j = C52642c.m58992j(jVar.field_packageName);
                if (!f113977w.containsKey(jVar.field_appId) || f113977w.get(jVar.field_appId).intValue() <= j) {
                    C42046d.m45751j(this.f113984h, jVar.field_appId);
                    C40314g.m43485d(this.f113984h, 10, 1002, this.f113990q, 3, 0, jVar.field_appId, this.f113989p, 0, (String) null, (String) null, (String) null);
                    this.f113985i.remove(jVar);
                    this.f113985i.addFirst(jVar);
                } else {
                    FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls2)).Ds0()).mo63967o(jVar.field_appId);
                    int i2 = o.f12196f;
                    if (i2 == 1) {
                        ((C40935l) ((C13754y) C86312j.m106911c(cls2)).Ds0()).mo63970r(o.f12194d);
                    } else if (i2 != 3) {
                        mo66218a(jVar);
                    } else if (!C86013q1.m106450k(o.f12197g) || C52642c.m58991i(o.f12197g) <= j) {
                        ((C40935l) ((C13754y) C86312j.m106911c(cls2)).Ds0()).mo63970r(o.f12194d);
                        mo66218a(jVar);
                    } else {
                        ((C45962f) C86312j.m106911c(cls)).mo71272UC(this.f113984h, o.f12197g, (C47223a) null);
                    }
                }
                mo66219b(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                FileDownloadTaskInfo o2 = ((C40935l) ((C13754y) C86312j.m106911c(cls2)).Ds0()).mo63967o(jVar.field_appId);
                if (o2 == null || o2.f12196f != 3) {
                    Log.m105925i("MicroMsg.GameInstalledView", "app not installed or download sucess : [%s]", jVar.field_appName);
                    mo66219b(false);
                } else {
                    if (Util.isNullOrNil(o2.f12197g) || !C86013q1.m106450k(o2.f12197g)) {
                        Log.m105921e("MicroMsg.GameInstalledView", "file status is success, while the download file not exsit:[%s]", o2.f12197g);
                        ((C40935l) ((C13754y) C86312j.m106911c(cls2)).Ds0()).mo63970r(o2.f12194d);
                        mo66219b(false);
                    } else {
                        ((C45962f) C86312j.m106911c(cls)).mo71272UC(this.f113984h, o2.f12197g, (C47223a) null);
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
        } else if (view.getTag() instanceof C42204b) {
            C42204b bVar = (C42204b) view.getTag();
            Intent intent = new Intent();
            if (Util.isNullOrNil(bVar.f113999c)) {
                intent.setClass(this.f113984h, GameLibraryUI.class);
                intent.putExtra("game_report_from_scene", 1002);
                Context context = this.f113984h;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameInstalledView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/GameInstalledView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                i = 6;
            } else {
                i = C52642c.m59002t(this.f113984h, bVar.f113999c, "game_center_installed_more");
            }
            C40314g.m43485d(this.f113984h, 10, 1002, this.f113991r, i, 0, (String) null, this.f113989p, 0, (String) null, (String) null, (String) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113980d = (LinearLayout) findViewById(C0966R.C0970id.eld);
        C42091s.m45783a(this.f113995v);
    }

    public void setInstalledGameInfo(LinkedList<C42039b> linkedList) {
        this.f113993t = linkedList;
    }

    public void setMoreGameInfo(C42204b bVar) {
        this.f113992s = bVar;
    }

    public void setSourceScene(int i) {
        this.f113989p = i;
    }

    public void setVersionCodes(Map<String, Integer> map) {
        if (map != null && !map.isEmpty()) {
            f113977w = map;
        }
    }
}
