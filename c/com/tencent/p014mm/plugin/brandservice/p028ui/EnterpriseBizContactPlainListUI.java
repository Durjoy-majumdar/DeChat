package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gx0.C45968i;
import gx0.C45969j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lj3.C46863b;
import p196ln.C76705f;
import p196ln.C76708i;
import p214om.C11502f;
import p248ug.C52558c;
import p629ny.C76979h;
import rb0.C47969h;
import rb0.C47976j;
import rb0.C47984k;
import rb0.C48009v0;
import te3.C49566gj;
import wc3.C78541w;
import wd3.C15148g1;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI */
public class EnterpriseBizContactPlainListUI extends MMActivity {

    /* renamed from: d */
    public C40621d f109118d;

    /* renamed from: e */
    public ListView f109119e;

    /* renamed from: f */
    public int f109120f;

    /* renamed from: g */
    public String f109121g;

    /* renamed from: h */
    public long f109122h;

    /* renamed from: i */
    public AdapterView.OnItemClickListener f109123i;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$a */
    public class C40618a implements AdapterView.OnItemClickListener {
        public C40618a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            C52558c.C52560b.C52563c.C52564a d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Log.m105925i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "onItemClick position = %s", Integer.valueOf(i));
            EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = EnterpriseBizContactPlainListUI.this;
            C49566gj gjVar = (C49566gj) enterpriseBizContactPlainListUI.f109118d.getItem(i);
            if (gjVar == null || (str = gjVar.f134062d) == null) {
                Log.m105920e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "item is null.");
            } else {
                int i2 = enterpriseBizContactPlainListUI.f109120f;
                if (i2 == 1) {
                    ((C78541w) C86312j.m106911c(C78541w.class)).Iu0(enterpriseBizContactPlainListUI.mController, (Bitmap) null, gjVar.f134062d, enterpriseBizContactPlainListUI.getString(C0966R.string.i4d), ((C75339i) C86312j.m106911c(C75339i.class)).mo62514P1(gjVar.f134062d), (String) null, enterpriseBizContactPlainListUI.getString(C0966R.string.a2s), new C45968i(enterpriseBizContactPlainListUI, gjVar));
                } else if (i2 == 2) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", gjVar.f134062d);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, enterpriseBizContactPlainListUI);
                } else if (i2 == 3) {
                    HashMap hashMap = (HashMap) enterpriseBizContactPlainListUI.getIntent().getSerializableExtra("enterprise_extra_params");
                    C15148g1.C15149a.f41275a.Sk0(enterpriseBizContactPlainListUI.getController(), (String) hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), (String) hashMap.get("img_url"), (String) hashMap.get("desc"), (String) null, false, enterpriseBizContactPlainListUI.getResources().getString(C0966R.string.a2s), new C45969j(enterpriseBizContactPlainListUI, gjVar.f134062d));
                } else if (i2 == 4) {
                    C52558c b = C47984k.m53328b(str);
                    String str2 = null;
                    if (b != null) {
                        b.mo73499q2();
                        C52558c.C52560b bVar = b.f146785x0;
                        if (!(bVar == null || (d = bVar.mo73511d()) == null)) {
                            str2 = d.f146830d;
                        }
                    }
                    if (!Util.isNullOrNil(str2)) {
                        C47969h jo = C48009v0.Ex0().mo72749jo(b.mo73498p2());
                        int i3 = jo != null ? jo.field_qyUin : 0;
                        int i4 = jo != null ? jo.field_userUin : 0;
                        C47969h jo4 = C48009v0.Ex0().mo72749jo(b.field_username);
                        int i5 = jo4 == null ? 0 : jo4.field_qyUin;
                        C115669n.INSTANCE.mo160131h(13419, Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i4), 1);
                        Log.m105919d("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "bizEnterpriseActive report fatherUin:%d,childUin:%d,userUin:%d,scene:%d", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i4), 1);
                        Intent intent2 = new Intent();
                        intent2.putExtra("rawUrl", str2);
                        intent2.putExtra("useJs", true);
                        intent2.putExtra("srcUsername", gjVar.f134062d);
                        intent2.putExtra("enterprise_biz_name", enterpriseBizContactPlainListUI.f109121g);
                        intent2.putExtra("biz_chat_chat_id", enterpriseBizContactPlainListUI.f109122h);
                        C88144b.m109795m(enterpriseBizContactPlainListUI.getContext(), "webview", ".ui.tools.WebViewUI", intent2, 1);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$b */
    public class C40619b implements MenuItem.OnMenuItemClickListener {
        public C40619b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EnterpriseBizContactPlainListUI.this.hideVKB();
            EnterpriseBizContactPlainListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$c */
    public class C40620c implements View.OnClickListener {
        public C40620c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = EnterpriseBizContactPlainListUI.this.f109119e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$d */
    public class C40621d extends C6975i1<C49566gj> {

        /* renamed from: o */
        public C46863b.C46867d f109127o = null;

        /* renamed from: p */
        public C46863b f109128p = new C46863b(15, new C40622a(this));

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$d$a */
        public class C40622a implements C46863b.C46866c {
            public C40622a(C40621d dVar) {
            }

            /* renamed from: a */
            public Bitmap mo63515a(String str) {
                return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$d$b */
        public class C40623b implements Runnable {
            public C40623b() {
            }

            public void run() {
                C40621d.this.mo1333o();
                TextView textView = (TextView) EnterpriseBizContactPlainListUI.this.findViewById(C0966R.C0970id.ckg);
                if (!(EnterpriseBizContactPlainListUI.this.f109119e == null || textView == null)) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(EnterpriseBizContactPlainListUI.this.f109121g);
                    if (z1Var == null || !z1Var.mo62927s3()) {
                        EnterpriseBizContactPlainListUI.this.f109119e.setVisibility(8);
                        textView.setVisibility(0);
                    } else if (EnterpriseBizContactPlainListUI.this.f109118d.getCount() <= 0) {
                        EnterpriseBizContactPlainListUI.this.f109119e.setVisibility(8);
                        textView.setVisibility(0);
                    } else {
                        EnterpriseBizContactPlainListUI.this.f109119e.setVisibility(0);
                        textView.setVisibility(8);
                        EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = EnterpriseBizContactPlainListUI.this;
                        enterpriseBizContactPlainListUI.f109119e.setAdapter(enterpriseBizContactPlainListUI.f109118d);
                        EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI2 = EnterpriseBizContactPlainListUI.this;
                        enterpriseBizContactPlainListUI2.f109119e.setOnItemClickListener(enterpriseBizContactPlainListUI2.f109123i);
                    }
                }
                C40621d.this.notifyDataSetChanged();
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$d$c */
        public class C40624c implements C46863b.C46867d {
            public C40624c() {
            }

            /* renamed from: a */
            public int mo63517a() {
                return C40621d.this.getCount();
            }

            /* renamed from: b */
            public String mo63518b(int i) {
                if (i < 0 || i >= C40621d.this.getCount()) {
                    Log.m105920e("MicroMsg.EnterpriseBizListAdapter", "pos is invalid");
                    return null;
                }
                C49566gj gjVar = (C49566gj) C40621d.this.getItem(i);
                if (gjVar == null) {
                    return null;
                }
                return gjVar.f134062d;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI$d$d */
        public class C40625d {

            /* renamed from: a */
            public ImageView f109132a;

            /* renamed from: b */
            public TextView f109133b;

            public C40625d(C40621d dVar) {
            }

            /* renamed from: a */
            public void mo63519a() {
                ImageView imageView = this.f109132a;
                if (imageView != null) {
                    imageView.setImageDrawable((Drawable) null);
                    this.f109132a.setVisibility(8);
                }
                TextView textView = this.f109133b;
                if (textView != null) {
                    textView.setText("");
                    this.f109133b.setVisibility(8);
                }
            }
        }

        public C40621d(Context context) {
            super(context, new C49566gj());
            mo1333o();
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C49566gj gjVar = (C49566gj) obj;
            if (gjVar == null) {
                Log.m105920e("MicroMsg.EnterpriseBizListAdapter", "item == null");
                gjVar = new C49566gj();
            }
            if (cursor != null) {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(cursor);
                C52558c cVar = new C52558c();
                cVar.convertFrom(cursor);
                String username = z1Var.getUsername();
                gjVar.f134062d = username;
                gjVar.f134063e = z1Var;
                gjVar.f134064f = cVar;
                Log.m105919d("MicroMsg.EnterpriseBizListAdapter", "convertFrom userName = %s", username);
            }
            return gjVar;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C40625d dVar;
            View view2;
            if (this.f109127o == null) {
                this.f109127o = new C40624c();
            }
            C46863b bVar = this.f109128p;
            if (bVar != null) {
                bVar.mo72072b(i, this.f109127o);
            }
            if (view == null) {
                dVar = new C40625d(this);
                view2 = View.inflate(this.f24696e, C0966R.C0971layout.a3j, (ViewGroup) null);
                dVar.f109132a = (ImageView) view2.findViewById(C0966R.C0970id.h_u);
                dVar.f109133b = (TextView) view2.findViewById(C0966R.C0970id.f358830ha0);
                view2.setTag(dVar);
            } else {
                view2 = view;
                dVar = (C40625d) view.getTag();
            }
            C49566gj gjVar = (C49566gj) getItem(i);
            if (gjVar == null) {
                dVar.mo63519a();
                return view2;
            }
            dVar.mo63519a();
            int paddingBottom = view2.getPaddingBottom();
            int paddingTop = view2.getPaddingTop();
            int paddingRight = view2.getPaddingRight();
            int paddingLeft = view2.getPaddingLeft();
            view2.setBackgroundDrawable(C76577a.m92158i(this.f24696e, C0966R.C0969drawable.f4855pa));
            view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            dVar.f109133b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f24696e, Util.nullAsNil(gjVar.f134063e.mo62909j3()), dVar.f109133b.getTextSize()));
            dVar.f109133b.setVisibility(0);
            dVar.f109132a.setVisibility(0);
            if (!Util.isNullOrNil(gjVar.f134063e.getUsername())) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(dVar.f109132a, gjVar.f134063e.getUsername());
            } else {
                dVar.f109132a.setImageDrawable((Drawable) null);
            }
            return view2;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.EnterpriseBizListAdapter", "accHasReady");
                return;
            }
            mo5580b();
            EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = EnterpriseBizContactPlainListUI.this;
            int i = enterpriseBizContactPlainListUI.f109120f;
            Cursor cursor = null;
            if (i == 1) {
                cursor = C48009v0.Fx0().mo72768mL(EnterpriseBizContactPlainListUI.this.f109121g, 25);
            } else if (i == 2) {
                C47976j Fx0 = C48009v0.Fx0();
                String str = EnterpriseBizContactPlainListUI.this.f109121g;
                StringBuilder sb = new StringBuilder();
                Fx0.mo72772vP(sb);
                Fx0.mo72766kD(sb);
                Fx0.mo72756Ow(sb, str);
                Fx0.mo72760Yt(sb, false);
                Fx0.mo72755Lo(sb, false);
                sb.append(" order by ");
                sb.append("rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
                String sb4 = sb.toString();
                Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseDisableChild sql %s", sb4);
                cursor = C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null);
            } else if (i == 3) {
                cursor = C48009v0.Fx0().mo72768mL(EnterpriseBizContactPlainListUI.this.f109121g, 128);
            } else if (i != 4) {
                cursor = C48009v0.Fx0().mo72753DN(EnterpriseBizContactPlainListUI.this.f109121g, true);
            } else {
                C52558c b = C47984k.m53328b(enterpriseBizContactPlainListUI.f109121g);
                if (!(b == null || b.field_enterpriseFather == null)) {
                    cursor = C48009v0.Fx0().mo72762bF(b.field_enterpriseFather);
                }
            }
            mo7998r(cursor);
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105924i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange");
            MMHandlerThread.postToMainThread(new C40623b());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3l;
    }

    public void initView() {
        this.f109119e = (ListView) findViewById(C0966R.C0970id.ckf);
        if (this.f109118d == null) {
            this.f109118d = new C40621d(this);
            this.f109123i = new C40618a();
        }
        Log.m105925i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "count = %s", Integer.valueOf(this.f109118d.getCount()));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f109121g);
        if (this.f109120f == 2) {
            setMMTitle((int) C0966R.string.f360380cb1);
        } else if (z1Var != null) {
            setMMTitle(z1Var.mo62909j3());
        }
        if (z1Var == null || !z1Var.mo62927s3() || this.f109118d.getCount() <= 0) {
            this.f109119e.setVisibility(8);
            TextView textView = (TextView) findViewById(C0966R.C0970id.ckg);
            textView.setText(C0966R.string.cb8);
            textView.setVisibility(0);
        } else {
            this.f109119e.setVisibility(0);
            this.f109119e.setAdapter(this.f109118d);
            this.f109119e.setOnItemClickListener(this.f109123i);
        }
        setBackBtn(new C40619b());
        setToTop(new C40620c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f109120f == 4) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109120f = getIntent().getIntExtra("enterprise_scene", 2);
        this.f109121g = getIntent().getStringExtra("enterprise_biz_name");
        this.f109122h = getIntent().getLongExtra("biz_chat_chat_id", -1);
        Log.m105925i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "bizName = %s", this.f109121g);
        initView();
        C48009v0.Fx0().add(this.f109118d);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this.f109118d);
    }

    public void onDestroy() {
        C48009v0.Fx0().remove(this.f109118d);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this.f109118d);
        this.f109118d.mo5580b();
        C40621d dVar = this.f109118d;
        C46863b bVar = dVar.f109128p;
        if (bVar != null) {
            bVar.mo72071a();
            dVar.f109128p = null;
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (!C45628s0.m50740E(this.f109121g)) {
            Log.m105921e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "%s !isContact", this.f109121g);
            finish();
        }
    }
}
