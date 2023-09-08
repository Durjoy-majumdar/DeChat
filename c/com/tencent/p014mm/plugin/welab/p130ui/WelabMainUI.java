package com.tencent.p014mm.plugin.welab.p130ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f40.C86737h0;
import gc0.C20828a;
import gc2.C116945b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import la3.C117468g;
import la3.C117470l;
import qe3.C89625d;
import ra3.C118229a;
import ta3.C118415d;
import te3.tg4;

@C86737h0
/* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI */
public class WelabMainUI extends MMActivity {

    /* renamed from: q */
    public static final Map<String, String> f347617q = new C30626c();

    /* renamed from: d */
    public boolean f347618d = false;

    /* renamed from: e */
    public LinearLayout f347619e;

    /* renamed from: f */
    public LinearLayout f347620f;

    /* renamed from: g */
    public LinearLayout f347621g;

    /* renamed from: h */
    public LinearLayout f347622h;

    /* renamed from: i */
    public View f347623i;

    /* renamed from: j */
    public View f347624j;

    /* renamed from: n */
    public List<String> f347625n;

    /* renamed from: o */
    public Comparator<C118229a> f347626o = new C115858d(this);

    /* renamed from: p */
    public View.OnClickListener f347627p = new C115859e();

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI$a */
    public class C6631a implements View.OnClickListener {
        public C6631a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/welab/ui/WelabMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, view.getResources().getString(C0966R.string.lke));
            intent.putExtra("rawUrl", WelabMainUI.this.getContext().getString(C0966R.string.lk7, new Object[]{LocaleUtil.getApplicationLanguage(), Integer.valueOf(C89625d.f257841g)}));
            intent.putExtra("showShare", false);
            C88144b.m109791i(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/welab/ui/WelabMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI$b */
    public class C6632b implements MenuItem.OnMenuItemClickListener {
        public C6632b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WelabMainUI.this.hideVKB();
            WelabMainUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI$c */
    public class C30626c extends HashMap<String, String> {
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI$d */
    public class C115858d implements Comparator<C118229a> {
        public C115858d(WelabMainUI welabMainUI) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                ra3.a r6 = (ra3.C118229a) r6
                ra3.a r7 = (ra3.C118229a) r7
                r0 = 0
                r1 = 1
                if (r6 != r7) goto L_0x0009
                goto L_0x002e
            L_0x0009:
                r2 = -1
                if (r6 != 0) goto L_0x000d
                goto L_0x0029
            L_0x000d:
                if (r7 != 0) goto L_0x0010
                goto L_0x0027
            L_0x0010:
                int r3 = r6.field_Pos
                int r4 = r7.field_Pos
                if (r3 != r4) goto L_0x002b
                java.lang.String r6 = r6.field_expId
                int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
                java.lang.String r7 = r7.field_expId
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)
                if (r6 != r7) goto L_0x0025
                goto L_0x002e
            L_0x0025:
                if (r7 <= r6) goto L_0x0029
            L_0x0027:
                r0 = 1
                goto L_0x002e
            L_0x0029:
                r0 = -1
                goto L_0x002e
            L_0x002b:
                if (r3 <= r4) goto L_0x0029
                goto L_0x0027
            L_0x002e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.welab.p130ui.WelabMainUI.C115858d.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI$e */
    public class C115859e implements View.OnClickListener {
        public C115859e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag();
            if (tag instanceof C118229a) {
                C118229a aVar = (C118229a) tag;
                Intent intent = new Intent();
                intent.putExtra("para_appid", aVar.field_LabsAppId);
                C118415d dVar = C118415d.f353896c;
                intent.putExtra("para_from_with_red_point", dVar.mo183207a(aVar) ? 1 : 0);
                intent.setClass(WelabMainUI.this, WelabAppInfoUI.class);
                WelabMainUI welabMainUI = WelabMainUI.this;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                WelabMainUI welabMainUI2 = welabMainUI;
                C117292a.m165358d(welabMainUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                welabMainUI.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(welabMainUI2, "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                String str = aVar.field_LabsAppId;
                ((HashMap) dVar.f353897a).put(str, 1);
                dVar.f353898b += "&" + str + "=" + 1;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WELAB_REDPOINT_STRING, dVar.f353898b);
                dVar.mo183210d();
                String str2 = (String) ((HashMap) WelabMainUI.f347617q).get(aVar.field_LabsAppId);
                if (!TextUtils.isEmpty(str2)) {
                    C116945b.yx0().mo175762a(C115624i.m162567c(str2));
                }
                Log.m105924i("MicroMsg.WelabMainUI", "click " + aVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI$f */
    public static class C115860f implements C115619a {

        /* renamed from: d */
        public TextView f347629d;

        /* renamed from: e */
        public C118229a f347630e;

        /* renamed from: f */
        public View f347631f;

        public C115860f(ImageView imageView, TextView textView, C118229a aVar, View view) {
            this.f347629d = textView;
            this.f347630e = aVar;
            this.f347631f = view;
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f347631f;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            return false;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            return false;
        }

        public String getPath() {
            C118229a aVar = this.f347630e;
            if (aVar == null) {
                return null;
            }
            return (String) ((HashMap) WelabMainUI.f347617q).get(aVar.field_LabsAppId);
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            if (z) {
                this.f347629d.setVisibility(0);
                return true;
            }
            this.f347629d.setVisibility(8);
            return true;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return false;
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    /* renamed from: H7 */
    public final void mo176391H7(C118229a aVar, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = (LinearLayout) getLayoutInflater().inflate(C0966R.C0971layout.cif, linearLayout, false);
        ImageView imageView = (ImageView) linearLayout2.findViewById(C0966R.C0970id.kp_);
        ImageView imageView2 = (ImageView) linearLayout2.findViewById(C0966R.C0970id.f6040vm);
        TextView textView = (TextView) linearLayout2.findViewById(C0966R.C0970id.knx);
        TextView textView2 = (TextView) linearLayout2.findViewById(C0966R.C0970id.k_z);
        TextView textView3 = (TextView) linearLayout2.findViewById(C0966R.C0970id.kyf);
        if (C118415d.f353896c.mo183207a(aVar)) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            C116945b.yx0().mo175770k(new C115860f(imageView, textView3, aVar, linearLayout2));
        }
        C20828a b = C20828a.m22825b();
        String m2 = aVar.mo183024m2("field_ThumbUrl");
        C117468g gVar = C117468g.f351552c;
        b.mo32519h(m2, imageView2, gVar.f351554b);
        textView.setText(gVar.mo182172a(aVar));
        textView2.setText(aVar.mo183024m2("field_Desc"));
        linearLayout2.setTag(aVar);
        linearLayout2.setOnClickListener(this.f347627p);
        linearLayout.addView(linearLayout2);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cii;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.lk9);
        setTitleDividerColor(C0966R.color.al6);
        setActionbarColor(getResources().getColor(C0966R.color.al5));
        setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
        this.f347619e = (LinearLayout) findViewById(C0966R.C0970id.f358880hm1);
        this.f347621g = (LinearLayout) findViewById(C0966R.C0970id.f358881hm2);
        this.f347620f = (LinearLayout) findViewById(C0966R.C0970id.k2k);
        this.f347622h = (LinearLayout) findViewById(C0966R.C0970id.k2l);
        this.f347623i = findViewById(C0966R.C0970id.i2r);
        this.f347624j = findViewById(C0966R.C0970id.hg6);
        this.f347623i.setOnClickListener(new C6631a());
        setBackBtn(new C6632b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setIsDarkActionbarBg(true);
        hideActionbarLine();
        if (getIntent() != null) {
            boolean z = false;
            if (getIntent().getIntExtra("para_from_with_red_point", 0) == 1) {
                z = true;
            }
            this.f347618d = z;
            this.f347625n = getIntent().getStringArrayListExtra("key_exclude_apps");
        }
        initView();
        C118415d dVar = C118415d.f353896c;
        dVar.getClass();
        MMApplicationContext.getDefaultPreference().edit().putBoolean("key_has_enter_welab", true).commit();
        dVar.mo183210d();
        C117470l.m165698a("", 1, this.f347618d);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f347621g.removeAllViews();
        this.f347622h.removeAllViews();
        List<C118229a> d = C117468g.f351552c.mo182175d();
        ArrayList arrayList = (ArrayList) d;
        if (arrayList.isEmpty()) {
            this.f347619e.setVisibility(8);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C118229a aVar = (C118229a) it.next();
                if (!Util.isNullOrNil(aVar.field_LabsAppId) && this.f347625n.contains(aVar.field_LabsAppId)) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                this.f347619e.setVisibility(8);
            } else {
                this.f347619e.setVisibility(0);
                Collections.sort(d, this.f347626o);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    mo176391H7((C118229a) it4.next(), this.f347621g);
                }
                Log.m105918d("MicroMsg.WelabMainUI", "get online app count " + this.f347621g.getChildCount());
            }
        }
        List<C118229a> jo = C117468g.f351552c.mo182174c().mo140537jo();
        ArrayList arrayList2 = (ArrayList) jo;
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            C118229a aVar2 = (C118229a) it5.next();
            if ((System.currentTimeMillis() / 1000) - aVar2.field_endtime >= 2592000 || "labs1de6f3".equals(aVar2.field_LabsAppId)) {
                it5.remove();
                C117468g.f351552c.mo182174c().delete(aVar2, new String[0]);
            } else if (aVar2.mo183026o2() && aVar2.field_Switch != 3) {
                aVar2.field_Switch = 3;
                C117468g.f351552c.mo182174c().update(aVar2, new String[0]);
            } else if (aVar2.field_Switch != 3) {
                it5.remove();
            }
        }
        Log.m105925i("WelabMgr", "stopped lab %s", jo.toString());
        if (arrayList2.isEmpty()) {
            this.f347620f.setVisibility(8);
        } else {
            this.f347620f.setVisibility(0);
            Collections.sort(jo, this.f347626o);
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                mo176391H7((C118229a) it6.next(), this.f347622h);
            }
            Log.m105918d("MicroMsg.WelabMainUI", "get online app count " + this.f347622h.getChildCount());
        }
        if (this.f347619e.getVisibility() == 0 || this.f347620f.getVisibility() == 0) {
            View view = this.f347624j;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view2 = this.f347624j;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
