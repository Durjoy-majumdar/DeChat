package com.tencent.p014mm.plugin.product.p087ui;

import af2.C39552d;
import af2.C39553h;
import af2.C39560p;
import af2.C67033e;
import af2.C67036o;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bf2.C67223a;
import bf2.C67224c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RcptRecentAddrEvent;
import com.tencent.p014mm.plugin.product.p087ui.MallProductHelper;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import p755xs.C102720b;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101835rd0;
import ze2.C79322b;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI */
public class MallProductUI extends MallBaseUI implements C102720b.C78973a {

    /* renamed from: e */
    public LinearLayout f202337e;

    /* renamed from: f */
    public LinearLayout f202338f;

    /* renamed from: g */
    public ImageView f202339g;

    /* renamed from: h */
    public TextView f202340h;

    /* renamed from: i */
    public TextView f202341i;

    /* renamed from: j */
    public TextView f202342j;

    /* renamed from: n */
    public HtmlTextView f202343n;

    /* renamed from: o */
    public HtmlTextView f202344o;

    /* renamed from: p */
    public RelativeLayout f202345p;

    /* renamed from: q */
    public ListView f202346q;

    /* renamed from: r */
    public C70104a f202347r;

    /* renamed from: s */
    public ListView f202348s;

    /* renamed from: t */
    public C70118p f202349t = null;

    /* renamed from: u */
    public Button f202350u;

    /* renamed from: v */
    public C67033e f202351v;

    /* renamed from: w */
    public MallProductHelper f202352w;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$a */
    public class C70094a implements MallProductHelper.C70078a {

        /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$a$a */
        public class C70095a implements Runnable {
            public C70095a() {
            }

            public void run() {
                ScrollView scrollView = (ScrollView) MallProductUI.this.findViewById(C0966R.C0970id.gno);
                if (scrollView != null) {
                    scrollView.pageScroll(33);
                }
            }
        }

        public C70094a() {
        }

        /* renamed from: a */
        public void mo96460a(int i, int i2, String str) {
            LinkedList<C67223a> linkedList;
            if (i == 0 && i2 == 0) {
                MallProductUI mallProductUI = MallProductUI.this;
                C67036o oVar = mallProductUI.f202351v.f192533b;
                if (oVar == null) {
                    mallProductUI.showOptionMenu(false);
                } else {
                    mallProductUI.showOptionMenu(true);
                    mallProductUI.setContentViewVisibility(0);
                    mallProductUI.f202337e.setVisibility(0);
                    mallProductUI.f202338f.setVisibility(8);
                    Class cls = C102720b.class;
                    C67224c cVar = oVar.f192558e;
                    if (cVar != null) {
                        mallProductUI.f202340h.setText(cVar.f193024d);
                        TextView textView = mallProductUI.f202341i;
                        C67224c cVar2 = oVar.f192558e;
                        textView.setText(C39552d.m42186c(cVar2.f193027g, cVar2.f193028h, cVar2.f193040w));
                        TextView textView2 = mallProductUI.f202342j;
                        C67224c cVar3 = oVar.f192558e;
                        textView2.setText(C39552d.m42185b((double) cVar3.f193026f, cVar3.f193040w));
                    }
                    if (mallProductUI.f202351v.mo91004g() <= 0) {
                        mallProductUI.f202350u.setEnabled(false);
                        mallProductUI.f202350u.setText(C0966R.string.goa);
                    } else if (mallProductUI.f202351v.f192533b.f192557d <= 0) {
                        mallProductUI.f202350u.setEnabled(false);
                        mallProductUI.f202350u.setText(C0966R.string.go_);
                    } else {
                        mallProductUI.f202350u.setEnabled(true);
                        if (!Util.isNullOrNil(oVar.f192563j)) {
                            mallProductUI.f202350u.setText(oVar.f192563j);
                        } else {
                            mallProductUI.f202350u.setText(C0966R.string.gny);
                        }
                    }
                    C67224c cVar4 = oVar.f192558e;
                    if (cVar4 == null || (linkedList = cVar4.f193039v) == null || linkedList.size() <= 0) {
                        mallProductUI.f202346q.setVisibility(8);
                    } else {
                        mallProductUI.f202346q.setVisibility(0);
                        mallProductUI.f202347r.mo96491b(oVar.f192558e.f193039v);
                        mallProductUI.f202347r.notifyDataSetChanged();
                    }
                    C67224c cVar5 = oVar.f192558e;
                    if (cVar5 == null || Util.isNullOrNil(cVar5.f193031n)) {
                        mallProductUI.f202345p.setVisibility(8);
                        mallProductUI.f202343n.setVisibility(8);
                    } else {
                        mallProductUI.f202345p.setVisibility(0);
                        mallProductUI.f202343n.setVisibility(0);
                        mallProductUI.f202343n.setText(oVar.f192558e.f193031n);
                    }
                    if (!Util.isNullOrNil(oVar.f192564k)) {
                        mallProductUI.f202344o.setVisibility(0);
                        mallProductUI.f202344o.setText(oVar.f192564k);
                    } else {
                        mallProductUI.f202344o.setVisibility(8);
                    }
                    mallProductUI.showOptionMenu(true);
                    if (!Util.isNullOrNil(mallProductUI.f202351v.f192542k)) {
                        mallProductUI.f202339g.setImageBitmap(((C102720b) C86312j.m106911c(cls)).mo142104N6(new C70106c(mallProductUI.f202351v.f192542k)));
                        ((C102720b) C86312j.m106911c(cls)).Lu0(mallProductUI);
                    }
                }
                Button button = MallProductUI.this.f202350u;
                if (button != null) {
                    button.postDelayed(new C70095a(), 200);
                }
            } else if (i2 == -10010003) {
                MallProductUI.this.setContentViewVisibility(0);
                MallProductUI.this.f202337e.setVisibility(8);
                MallProductUI.this.f202338f.setVisibility(0);
                MallProductUI mallProductUI2 = MallProductUI.this;
                List<C39560p> list = mallProductUI2.f202351v.f192534c;
                if (list != null && list.size() > 0) {
                    mallProductUI2.f202349t.f202406e = list;
                }
            } else {
                MallProductUI mallProductUI3 = MallProductUI.this;
                mallProductUI3.f202266d = str;
                mallProductUI3.showDialog(-10001);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$b */
    public class C70096b implements MenuItem.OnMenuItemClickListener {
        public C70096b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MallProductHelper mallProductHelper = MallProductUI.this.f202352w;
            if (!Util.isNullOrNil(mallProductHelper.f202273g.f192535d)) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C39553h(mallProductHelper.f202273g.mo91006i(), mallProductHelper.f202273g.f192535d));
            }
            mallProductHelper.f202273g.mo91000c();
            MallProductUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$c */
    public class C70097c implements AdapterView.OnItemClickListener {
        public C70097c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C70105b bVar = (C70105b) view.getTag();
            if (bVar.f202373f == 2) {
                C67036o oVar = MallProductUI.this.f202351v.f192533b;
                LinkedList<String> linkedList = oVar.f192558e.f193029i;
                if (linkedList != null && linkedList.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = oVar.f192558e.f193029i.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    bVar.f202374g = arrayList2;
                }
            }
            MallProductUI mallProductUI = MallProductUI.this;
            mallProductUI.f202347r.mo96490a(mallProductUI, view, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$d */
    public class C70098d implements View.OnClickListener {
        public C70098d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallProductHelper mallProductHelper = MallProductUI.this.f202352w;
            C75228t.m90226S(mallProductHelper.f202270d, mallProductHelper.f202273g.mo91007j());
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$e */
    public class C70099e implements AdapterView.OnItemClickListener {
        public C70099e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C39560p.C39561a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C70121r rVar = (C70121r) view.getTag();
            MallProductHelper mallProductHelper = MallProductUI.this.f202352w;
            mallProductHelper.getClass();
            if (!(rVar == null || (aVar = rVar.f202415f) == null)) {
                Log.m105924i("MicroMsg.MallProductUI", "goProductUI type : " + aVar.f106206c);
                int i2 = aVar.f106206c;
                if (i2 == 0) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", aVar.f106207d);
                    C75228t.m90217J(mallProductHelper.f202270d, intent);
                } else if (i2 == 1) {
                    String replace = aVar.f106208e.replace("product_id=", "");
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_product_id", replace);
                    intent2.putExtra("key_product_scene", 6);
                    C88144b.m109791i(mallProductHelper.f202270d, "mall", ".product.ui.MallProductUI", intent2, (Bundle) null);
                    mallProductHelper.f202270d.finish();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$f */
    public class C70100f implements View.OnClickListener {
        public C70100f() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
            r0 = r0.f192533b.f192558e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r14) {
            /*
                r13 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r14)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/product/ui/MallProductUI$6"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r13
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.product.ui.MallProductUI r14 = com.tencent.p014mm.plugin.product.p087ui.MallProductUI.this
                com.tencent.mm.plugin.product.ui.MallProductHelper r14 = r14.f202352w
                af2.e r0 = r14.f202273g
                int r1 = r0.f192537f
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x003e
                af2.o r4 = r0.f192533b
                if (r4 == 0) goto L_0x003e
                int r4 = r0.mo91004g()
                if (r1 > r4) goto L_0x003e
                af2.o r0 = r0.f192533b
                bf2.c r0 = r0.f192558e
                if (r0 == 0) goto L_0x003e
                java.util.LinkedList<bf2.m> r0 = r0.f193037t
                if (r0 == 0) goto L_0x003e
                r0 = 1
                goto L_0x003f
            L_0x003e:
                r0 = 0
            L_0x003f:
                if (r0 == 0) goto L_0x00ad
                android.app.Activity r0 = r14.f202270d
                android.content.Intent r1 = new android.content.Intent
                android.app.Activity r4 = r14.f202270d
                java.lang.Class<com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI> r5 = com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI.class
                r1.<init>(r4, r5)
                k20.a r12 = new k20.a
                r12.<init>()
                r12.mo10233c(r1)
                java.lang.Object[] r5 = r12.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/product/ui/MallProductHelper"
                java.lang.String r7 = "goSelectSku"
                java.lang.String r8 = "()V"
                java.lang.String r9 = "Undefined"
                java.lang.String r10 = "startActivity"
                java.lang.String r11 = "(Landroid/content/Intent;)V"
                r4 = r0
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r1 = r12.mo10231a(r3)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.startActivity(r1)
                java.lang.String r5 = "com/tencent/mm/plugin/product/ui/MallProductHelper"
                java.lang.String r6 = "goSelectSku"
                java.lang.String r7 = "()V"
                java.lang.String r8 = "Undefined"
                java.lang.String r9 = "startActivity"
                java.lang.String r10 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r1 = 11008(0x2b00, float:1.5425E-41)
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                af2.e r5 = r14.f202273g
                java.lang.String r5 = r5.mo91007j()
                r4[r3] = r5
                af2.e r14 = r14.f202273g
                af2.o r14 = r14.f192533b
                java.lang.String r14 = r14.f192554a
                r4[r2] = r14
                r14 = 2
                int r3 = com.tencent.p014mm.plugin.product.p087ui.MallProductHelper.f202269j
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r14] = r3
                r14 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r14] = r2
                r0.mo160131h(r1, r4)
                goto L_0x00b9
            L_0x00ad:
                android.app.Activity r14 = r14.f202270d
                r0 = 2131832714(0x7f112f8a, float:1.929849E38)
                android.widget.Toast r14 = nj3.C76912y0.makeText((android.content.Context) r14, (int) r0, (int) r2)
                r14.show()
            L_0x00b9:
                java.lang.String r14 = "com/tencent/mm/plugin/product/ui/MallProductUI$6"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r13, r14, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.product.p087ui.MallProductUI.C70100f.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$g */
    public class C70101g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$g$a */
        public class C70102a implements C76879j.C11180n {
            public C70102a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i == 0) {
                    MallProductHelper mallProductHelper = MallProductUI.this.f202352w;
                    String p = mallProductHelper.f202273g.mo91012p();
                    Intent intent = new Intent();
                    intent.putExtra("Retr_Msg_content", p);
                    intent.putExtra("Retr_Msg_Type", 2);
                    if (!Util.isNullOrNil(mallProductHelper.f202273g.f192533b.mo91020a())) {
                        intent.putExtra("Retr_Msg_thumb_path", mallProductHelper.f202273g.mo91008k());
                    }
                    intent.putExtra("Retr_go_to_chattingUI", false);
                    intent.putExtra("Retr_show_success_tips", true);
                    intent.putExtra("Retr_Msg_Type", 2);
                    C88144b.m109801s(mallProductHelper.f202270d, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
                    if (MallProductHelper.f202269j == 4) {
                        C115669n.INSTANCE.mo160131h(10651, 11, 1, 0);
                    }
                } else if (i == 1) {
                    MallProductHelper mallProductHelper2 = MallProductUI.this.f202352w;
                    C67036o oVar = mallProductHelper2.f202273g.f192533b;
                    Intent intent2 = new Intent();
                    intent2.putExtra("KContentObjDesc", mallProductHelper2.f202273g.mo91013q());
                    intent2.putExtra("Ksnsupload_title", oVar.f192558e.f193024d);
                    intent2.putExtra("Ksnsupload_link", mallProductHelper2.f202273g.mo91009l());
                    intent2.putExtra("Ksnsupload_imgurl", mallProductHelper2.f202273g.f192533b.mo91020a());
                    if (!Util.isNullOrNil(mallProductHelper2.f202273g.f192533b.mo91020a())) {
                        intent2.putExtra("KsnsUpload_imgPath", mallProductHelper2.f202273g.mo91008k());
                    }
                    intent2.putExtra("Ksnsupload_type", 6);
                    intent2.putExtra("KUploadProduct_UserData", mallProductHelper2.f202273g.mo91014r(oVar));
                    intent2.putExtra("KUploadProduct_subType", oVar.f192555b);
                    String a = C86493v0.m107223a("scan_product");
                    C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "scan_product");
                    intent2.putExtra("reportSessionId", a);
                    C88144b.m109791i(mallProductHelper2.f202270d, "sns", ".ui.SnsUploadUI", intent2, (Bundle) null);
                    if (MallProductHelper.f202269j == 4) {
                        C115669n.INSTANCE.mo160131h(10651, 11, 0, 0);
                    }
                } else if (i == 2) {
                    MallProductHelper mallProductHelper3 = MallProductUI.this.f202352w;
                    C67036o oVar2 = mallProductHelper3.f202273g.f192533b;
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C101801kd0 kd02 = new C101801kd0();
                    C101835rd0 rd02 = new C101835rd0();
                    C101793jd0 jd02 = new C101793jd0();
                    rd02.mo141275k(C75592q0.m90789s());
                    rd02.mo141279o(C75592q0.m90789s());
                    rd02.mo141277m(11);
                    rd02.mo141273f(Util.nowMilliSecond());
                    jd02.mo141207o(oVar2.f192558e.f193024d);
                    jd02.mo141204l(mallProductHelper3.f202273g.mo91013q());
                    jd02.mo141208p(oVar2.f192555b);
                    jd02.mo141205m(mallProductHelper3.f202273g.mo91014r(oVar2));
                    jd02.mo141206n(oVar2.mo91020a());
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264679d = oVar2.f192558e.f193024d;
                    aVar.f264680e = mallProductHelper3.f202273g.mo91013q();
                    DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                    aVar2.f264676a = kd02;
                    aVar2.f264678c = 11;
                    kd02.mo141219q(rd02);
                    kd02.mo141218p(jd02);
                    DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                    aVar3.f264684i = mallProductHelper3.f202270d;
                    aVar3.f264688m = 5;
                    doFavoriteEvent.publish();
                } else if (i == 3) {
                    MallProductHelper mallProductHelper4 = MallProductUI.this.f202352w;
                    C75228t.m90223P(mallProductHelper4.f202270d, mallProductHelper4.f202273g.mo91007j());
                }
            }
        }

        public C70101g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String[] stringArray = MallProductUI.this.getResources().getStringArray(C0966R.array.f2585a1);
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (String add : stringArray) {
                arrayList.add(add);
            }
            if ((MallProductUI.this.f202351v.mo91001d().f202384a & 1) > 0) {
                z = true;
            }
            Log.m105918d("MicroMsg.MallProductConfig", "isShowSellerEntry, ret = " + z);
            if (z) {
                arrayList.add(MallProductUI.this.getString(C0966R.string.go9));
            }
            C76879j.m92737h(MallProductUI.this.getContext(), (String) null, (String[]) arrayList.toArray(new String[arrayList.size()]), (String) null, false, new C70102a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI$h */
    public class C70103h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f202362d;

        public C70103h(Bitmap bitmap) {
            this.f202362d = bitmap;
        }

        public void run() {
            MallProductUI.this.f202339g.setImageBitmap(this.f202362d);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.boe;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.goq);
        setBackBtn(new C70096b());
        this.f202337e = (LinearLayout) findViewById(C0966R.C0970id.gmn);
        this.f202338f = (LinearLayout) findViewById(C0966R.C0970id.gn8);
        this.f202339g = (ImageView) findViewById(C0966R.C0970id.gml);
        this.f202340h = (TextView) findViewById(C0966R.C0970id.gmh);
        this.f202341i = (TextView) findViewById(C0966R.C0970id.gmq);
        TextView textView = (TextView) findViewById(C0966R.C0970id.gmo);
        this.f202342j = textView;
        textView.getPaint().setFlags(16);
        this.f202345p = (RelativeLayout) findViewById(C0966R.C0970id.gmj);
        this.f202343n = (HtmlTextView) findViewById(C0966R.C0970id.gmi);
        this.f202344o = (HtmlTextView) findViewById(C0966R.C0970id.gmp);
        this.f202346q = (ListView) findViewById(C0966R.C0970id.gmg);
        C70104a aVar = new C70104a(this);
        this.f202347r = aVar;
        this.f202346q.setAdapter(aVar);
        this.f202346q.setOnItemClickListener(new C70097c());
        ((Button) findViewById(C0966R.C0970id.f358710gn0)).setOnClickListener(new C70098d());
        this.f202348s = (ListView) findViewById(C0966R.C0970id.gn9);
        C70118p pVar = new C70118p(this);
        this.f202349t = pVar;
        pVar.f202407f = new C70099e();
        this.f202348s.setAdapter(pVar);
        Button button = (Button) findViewById(C0966R.C0970id.gmk);
        this.f202350u = button;
        button.setOnClickListener(new C70100f());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C70101g());
        showOptionMenu(false);
        this.f202339g.setFocusable(true);
        this.f202339g.setFocusableInTouchMode(true);
        this.f202339g.requestFocus();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (str != null && str.equals(this.f202351v.f192542k)) {
            this.f202339g.post(new C70103h(bitmap));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        boolean booleanExtra = getIntent().getBooleanExtra("key_go_finish", false);
        setResult(-1);
        if (booleanExtra) {
            finish();
            return;
        }
        initView();
        this.f202351v = C79322b.vx0().wx0();
        MallProductHelper mallProductHelper = new MallProductHelper(getContext(), new C70094a());
        this.f202352w = mallProductHelper;
        C86709a0.m107525e().postAtFrontOfWorker(new C70110h(mallProductHelper, getIntent(), new C67036o()));
        mallProductHelper.f202271e = true;
        RcptRecentAddrEvent rcptRecentAddrEvent = new RcptRecentAddrEvent();
        rcptRecentAddrEvent.f9408e.f9411a = -1;
        rcptRecentAddrEvent.callback = new C4932i(mallProductHelper, rcptRecentAddrEvent);
        rcptRecentAddrEvent.asyncPublish(Looper.getMainLooper());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105926v("MicroMsg.MallProductUI", "onNewIntent");
        setIntent(intent);
    }

    public void onPause() {
        this.f202352w.mo96459d();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f202352w.mo96458c();
    }
}
