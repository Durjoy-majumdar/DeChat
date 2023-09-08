package com.tencent.p014mm.plugin.scanner.p101ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.plugin.scanner.C71030z;
import com.tencent.p014mm.plugin.scanner.model.C115673w;
import com.tencent.p014mm.plugin.scanner.model.C42908r;
import com.tencent.p014mm.plugin.scanner.model.C42909s;
import com.tencent.p014mm.plugin.scanner.model.C94474a;
import com.tencent.p014mm.plugin.scanner.model.C94476b0;
import com.tencent.p014mm.plugin.scanner.model.C94481y;
import com.tencent.p014mm.plugin.scanner.p101ui.C94515d;
import com.tencent.p014mm.plugin.scanner.p101ui.MusicPreference;
import com.tencent.p014mm.plugin.scanner.p101ui.ProductScrollView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import fl2.C32073a;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C47350c;
import p680ru.C101464l;
import p702ts.C78085c;
import p755xs.C102720b;
import pe3.C47465a;
import pj3.C47511g;
import qc0.C101093a;
import qc0.C101106m;
import sf0.C101592a0;
import sf0.C48374j0;
import te3.C51964xf;
import te3.C52254zf;
import vl2.C102216y;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI */
public class ProductUI extends MMPreference implements C102720b.C78973a, C11385n {

    /* renamed from: R */
    public static final /* synthetic */ int f273215R = 0;

    /* renamed from: A */
    public C94515d.C94518c f273216A;

    /* renamed from: B */
    public String f273217B;

    /* renamed from: C */
    public String f273218C;

    /* renamed from: D */
    public boolean f273219D = false;

    /* renamed from: E */
    public String f273220E;

    /* renamed from: F */
    public boolean f273221F = false;

    /* renamed from: G */
    public C32073a f273222G;

    /* renamed from: H */
    public C92411b f273223H;

    /* renamed from: I */
    public boolean f273224I = false;

    /* renamed from: J */
    public boolean f273225J;

    /* renamed from: K */
    public C92411b.C92412a f273226K = new C94490a();

    /* renamed from: L */
    public C86497v5.C86498c f273227L = new C94497g();

    /* renamed from: M */
    public MusicPreference.C94483b f273228M = new C94494d();

    /* renamed from: N */
    public List<MusicPreference> f273229N;

    /* renamed from: P */
    public boolean f273230P = true;

    /* renamed from: Q */
    public IListener f273231Q = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1155728636;
        }

        public boolean callback(IEvent iEvent) {
            int i = ((MusicPlayerEvent) iEvent).f9336d.f9337a;
            if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 7) {
                return false;
            }
            ProductUI productUI = ProductUI.this;
            if (productUI.f273232d == null) {
                return false;
            }
            productUI.mo129968Q7();
            return false;
        }
    };

    /* renamed from: d */
    public C47511g f273232d;

    /* renamed from: e */
    public ImageView f273233e;

    /* renamed from: f */
    public ImageView f273234f;

    /* renamed from: g */
    public View f273235g;

    /* renamed from: h */
    public TextView f273236h;

    /* renamed from: i */
    public TextView f273237i;

    /* renamed from: j */
    public ImageView f273238j;

    /* renamed from: n */
    public View f273239n;

    /* renamed from: o */
    public TextView f273240o;

    /* renamed from: p */
    public LinearLayout f273241p;

    /* renamed from: q */
    public C102216y.C102217a f273242q;

    /* renamed from: r */
    public View f273243r;

    /* renamed from: s */
    public int f273244s = 0;

    /* renamed from: t */
    public long f273245t;

    /* renamed from: u */
    public int f273246u;

    /* renamed from: v */
    public int f273247v;

    /* renamed from: w */
    public long f273248w;

    /* renamed from: x */
    public ProgressDialog f273249x = null;

    /* renamed from: y */
    public C71012o f273250y;

    /* renamed from: z */
    public HashMap<String, Boolean> f273251z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$o */
    public static final class C71012o implements C101592a0 {

        /* renamed from: a */
        public C102216y.C102217a f205506a;

        public C71012o(C102216y.C102217a aVar) {
            this.f205506a = aVar;
        }

        /* renamed from: a */
        public String mo94817a() {
            C102216y.C102217a aVar = this.f205506a;
            return aVar == null ? "" : aVar.field_thumburl;
        }

        /* renamed from: b */
        public C101592a0.C101593b mo94818b() {
            return null;
        }

        /* renamed from: c */
        public Bitmap mo94819c(Bitmap bitmap, C101592a0.C77686a aVar, String str) {
            if (C101592a0.C77686a.NET == aVar) {
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, mo94827k(), false);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.scanner.ProductUI", e, "", new Object[0]);
                }
            }
            return bitmap;
        }

        /* renamed from: d */
        public String mo94820d() {
            C102216y.C102217a aVar = this.f205506a;
            return aVar == null ? "" : aVar.field_thumburl;
        }

        /* renamed from: e */
        public Bitmap mo94821e() {
            if (MMApplicationContext.getContext() == null) {
                return null;
            }
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        }

        /* renamed from: f */
        public void mo94822f() {
        }

        /* renamed from: g */
        public String mo94823g() {
            C102216y.C102217a aVar = this.f205506a;
            return aVar == null ? "" : aVar.field_thumburl;
        }

        /* renamed from: h */
        public boolean mo94824h() {
            return false;
        }

        /* renamed from: i */
        public void mo94825i(C101592a0.C77686a aVar, String str) {
        }

        /* renamed from: j */
        public void mo94826j(String str, boolean z) {
        }

        /* renamed from: k */
        public String mo94827k() {
            return C71030z.vx0().xx0(this.f205506a.field_thumburl, "@S");
        }

        /* renamed from: l */
        public boolean mo94828l() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$m */
    public class C85413m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C102216y.C102217a f248926d;

        public C85413m(C102216y.C102217a aVar) {
            this.f248926d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProductUI productUI = ProductUI.this;
            String str = this.f248926d.field_introlink;
            int i = ProductUI.f273215R;
            productUI.mo129961J7(10003, str);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f248926d.field_introlink);
            int i2 = ProductUI.this.f273244s;
            intent.putExtra("geta8key_scene", i2 == 4 ? 11 : i2 == 3 ? 12 : 0);
            C88144b.m109791i(ProductUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$n */
    public class C85414n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C102216y.C102217a f248928d;

        public C85414n(C102216y.C102217a aVar) {
            this.f248928d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType((Context) ProductUI.this.getContext(), intent, Uri.parse(this.f248928d.field_playurl), "video/*", false);
            ProductUI productUI = ProductUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ProductUI productUI2 = productUI;
            C117292a.m165358d(productUI2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            productUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(productUI2, "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$a */
    public class C94490a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$a$a */
        public class C94491a implements DialogInterface.OnClickListener {
            public C94491a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(ProductUI.this);
            }
        }

        public C94490a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            float f3 = f;
            float f4 = f2;
            if (z) {
                Log.m105924i("MicroMsg.scanner.ProductUI", "getLocation suc");
                if (ProductUI.this.f273242q != null) {
                    Log.m105924i("MicroMsg.scanner.ProductUI", "do getActionInfoScene, lng=" + f3 + ", lat=" + f4);
                    ProductUI productUI = ProductUI.this;
                    String str = productUI.f273217B;
                    LinkedList<String> a = C94476b0.m119499a(productUI.f273242q.f300996a);
                    ProductUI productUI2 = ProductUI.this;
                    C86709a0.m107524d().mo123460f(new C42908r(str, a, productUI2.f273246u, productUI2.f273218C, (double) f3, (double) f4));
                }
                ProductUI productUI3 = ProductUI.this;
                C92411b bVar = productUI3.f273223H;
                if (bVar != null) {
                    bVar.mo126408b(productUI3.f273226K);
                }
                ProductUI productUI4 = ProductUI.this;
                if (!productUI4.f273224I) {
                    productUI4.f273224I = true;
                    ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2011, f3, f4, (int) d2);
                }
                return false;
            }
            if (!ProductUI.this.f273225J && !LocationUtil.isGpsEnable()) {
                ProductUI productUI5 = ProductUI.this;
                productUI5.f273225J = true;
                C76879j.m92709C(productUI5, productUI5.getString(C0966R.string.fez), ProductUI.this.getString(C0966R.string.a3h), ProductUI.this.getString(C0966R.string.fyd), ProductUI.this.getString(C0966R.string.f7926wf), false, new C94491a(), (DialogInterface.OnClickListener) null);
            }
            Log.m105928w("MicroMsg.scanner.ProductUI", "getLocation fail");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$b */
    public class C94492b implements MenuItem.OnMenuItemClickListener {
        public C94492b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String str;
            ProductUI productUI = ProductUI.this;
            int i = ProductUI.f273215R;
            productUI.getClass();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.add(productUI.getString(C0966R.string.lln));
            linkedList2.add(0);
            linkedList.add(productUI.getString(C0966R.string.llm));
            linkedList2.add(1);
            if (!productUI.getIntent().getBooleanExtra("key_is_favorite_item", false)) {
                linkedList.add(productUI.getString(C0966R.string.f361137hk2));
                linkedList2.add(2);
            } else if (productUI.getIntent().getBooleanExtra("key_can_delete_favorite_item", true)) {
                str = productUI.getString(C0966R.string.f7944x1);
                linkedList.add(productUI.getString(C0966R.string.f7399f8));
                linkedList2.add(3);
                String str2 = str;
                C102216y.C102217a aVar = productUI.f273242q;
                if (aVar != null && !TextUtils.isEmpty(aVar.field_exposeurl)) {
                    linkedList.add(productUI.getString(C0966R.string.bly));
                    linkedList2.add(4);
                }
                C76879j.m92733d(productUI, "", linkedList, linkedList2, str2, false, new C94524h(productUI));
                return true;
            }
            str = "";
            String str22 = str;
            C102216y.C102217a aVar2 = productUI.f273242q;
            linkedList.add(productUI.getString(C0966R.string.bly));
            linkedList2.add(4);
            C76879j.m92733d(productUI, "", linkedList, linkedList2, str22, false, new C94524h(productUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$c */
    public class C94493c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102216y.C102217a f273256d;

        public C94493c(C102216y.C102217a aVar) {
            this.f273256d = aVar;
        }

        public void run() {
            Bitmap N6;
            ProductUI productUI = ProductUI.this;
            C102216y.C102217a aVar = this.f273256d;
            int i = ProductUI.f273215R;
            productUI.mo129965N7(aVar);
            ProductUI productUI2 = ProductUI.this;
            C102216y.C102217a aVar2 = this.f273256d;
            productUI2.getClass();
            Class cls = C102720b.class;
            if (aVar2 == null || Util.isNullOrNil(aVar2.field_thumburl)) {
                Log.m105920e("MicroMsg.scanner.ProductUI", "product == null || Util.isNullOrNil(product.field_thumburl)");
                return;
            }
            try {
                productUI2.f273235g.setBackgroundColor(Color.parseColor(aVar2.field_headermask));
                if (!Util.isNullOrNil(aVar2.field_headermask) && aVar2.field_headermask.length() == 9) {
                    productUI2.f273243r.setBackgroundColor(Color.parseColor("#" + aVar2.field_headermask.substring(3, 9)));
                }
            } catch (Exception unused) {
                Log.m105928w("MicroMsg.scanner.ProductUI", "parse maskColor wrong");
            }
            Log.m105920e("MicroMsg.scanner.ProductUI", "begin to get the url " + aVar2.field_thumburl);
            Bitmap N62 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(productUI2.f273250y);
            if (N62 != null) {
                productUI2.f273233e.setImageBitmap(N62);
                productUI2.f273233e.setBackgroundDrawable((Drawable) null);
                productUI2.f273233e.setBackgroundColor(-1);
                productUI2.mo129971T7();
            } else {
                productUI2.f273233e.setImageBitmap((Bitmap) null);
            }
            if (!Util.isNullOrNil(aVar2.field_headerbackgroundurl) && (N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C78431a0(aVar2.field_headerbackgroundurl))) != null && !N6.isRecycled()) {
                productUI2.f273234f.setImageBitmap(N6);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$d */
    public class C94494d implements MusicPreference.C94483b {
        public C94494d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$e */
    public class C94495e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f273259d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f273260e;

        public C94495e(String str, Bitmap bitmap) {
            this.f273259d = str;
            this.f273260e = bitmap;
        }

        public void run() {
            ImageView imageView;
            if (this.f273259d.equals(ProductUI.this.f273242q.field_thumburl) && ProductUI.this.f273233e != null) {
                Log.m105924i("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + this.f273259d);
                try {
                    ProductUI.this.f273233e.setImageBitmap(this.f273260e);
                    ProductUI.this.f273233e.setBackgroundDrawable((Drawable) null);
                    ProductUI.this.f273233e.setBackgroundColor(-1);
                    ProductUI.this.mo129971T7();
                    ProductUI.this.getClass();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.scanner.ProductUI", "onGetPictureFinish : [%s]", e.getLocalizedMessage());
                }
            }
            if (this.f273259d.equals(ProductUI.this.f273242q.field_headerbackgroundurl) && (imageView = ProductUI.this.f273234f) != null) {
                imageView.setImageBitmap(this.f273260e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$f */
    public class C94496f implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C42909s f273262d;

        public C94496f(ProductUI productUI, C42909s sVar) {
            this.f273262d = sVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105918d("MicroMsg.scanner.ProductUI", "User cancel");
            C86709a0.m107524d().mo123458d(this.f273262d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$g */
    public class C94497g implements C86497v5.C86498c {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$g$a */
        public class C94498a implements Runnable {
            public C94498a() {
            }

            public void run() {
                ProductUI productUI = ProductUI.this;
                productUI.mo129965N7(productUI.f273242q);
            }
        }

        public C94497g() {
        }

        /* renamed from: C1 */
        public void mo23909C1(C35136m.C35138c cVar) {
        }

        /* renamed from: Y */
        public void mo23910Y(C35136m.C35137a aVar) {
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            Log.m105924i("MicroMsg.scanner.ProductUI", "lo-scanner-onRecieveMsg");
            C102216y.C102217a aVar2 = ProductUI.this.f273242q;
            if (aVar2 != null && !Util.isNullOrNil(g)) {
                Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
                String str = parseXml.get(".sysmsg.scanproductinfo.product.id");
                if (Util.isNullOrNil(aVar2.field_productid) || !aVar2.field_productid.equals(str)) {
                    Log.m105924i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: product id not match, productId=" + Util.nullAsNil(str) + ", target=" + aVar2.field_productid);
                } else {
                    LinkedList<C94474a> b = C94474a.m119498b(parseXml, ".sysmsg.scanproductinfo.product");
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < b.size(); i++) {
                        LinkedList<C94474a.C94475a> linkedList = b.get(i).f273158f;
                        if (linkedList != null) {
                            for (int i2 = 0; i2 < linkedList.size(); i2++) {
                                C94474a.C94475a aVar3 = linkedList.get(i2);
                                if (aVar3 != null) {
                                    hashMap.put(aVar3.f273178t, aVar3);
                                }
                            }
                        }
                    }
                    Log.m105924i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: toUpdateSize=" + hashMap.size());
                    C94476b0.m119500b(aVar2.f300996a, hashMap);
                }
            }
            MMHandlerThread.postToMainThread(new C94498a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$h */
    public class C94499h implements MenuItem.OnMenuItemClickListener {
        public C94499h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ProductUI productUI = ProductUI.this;
            if (productUI.f273246u == 4) {
                productUI.setResult(0);
            }
            ProductUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$i */
    public class C94500i implements C94515d.C94518c {
        public C94500i() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$j */
    public class C94501j implements View.OnClickListener {
        public C94501j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProductUI.m119512H7(ProductUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$k */
    public class C94502k implements View.OnClickListener {
        public C94502k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProductUI.m119512H7(ProductUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$l */
    public class C94503l implements View.OnClickListener {
        public C94503l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102216y.C102217a aVar = ProductUI.this.f273242q;
            if (aVar != null && !Util.isNullOrNil(aVar.field_certificationurl)) {
                ProductUI productUI = ProductUI.this;
                productUI.mo129961J7(10002, productUI.f273242q.field_certificationurl);
                ProductUI productUI2 = ProductUI.this;
                productUI2.mo129970S7(productUI2.f273242q.field_certificationurl);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$p */
    public final class C94504p {

        /* renamed from: a */
        public ProductScrollView f273270a;

        /* renamed from: b */
        public int f273271b;

        /* renamed from: c */
        public boolean f273272c;

        /* renamed from: d */
        public ProductScrollView.C94488a f273273d = new C94505a();

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductUI$p$a */
        public class C94505a implements ProductScrollView.C94488a {
            public C94505a() {
            }
        }

        public C94504p() {
            ProductScrollView productScrollView = (ProductScrollView) ProductUI.this.findViewById(C0966R.C0970id.i8g);
            this.f273270a = productScrollView;
            productScrollView.setOnScrollListener(this.f273273d);
            int i = ProductUI.f273215R;
            ProductUI.this.getClass();
            TypedValue typedValue = new TypedValue();
            this.f273271b = ProductUI.this.getTheme().resolveAttribute(C0966R.attr.f2625a0, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, ProductUI.this.getResources().getDisplayMetrics()) : 0;
        }
    }

    /* renamed from: H7 */
    public static void m119512H7(ProductUI productUI) {
        C102216y.C102217a aVar = productUI.f273242q;
        if (aVar == null) {
            return;
        }
        if (!Util.isNullOrNil(aVar.field_detailurl)) {
            productUI.mo129961J7(10000, productUI.f273242q.field_detailurl);
            productUI.mo129970S7(productUI.f273242q.field_detailurl);
        } else if (!Util.isNullOrNil(productUI.f273242q.field_xml) && productUI.f273219D) {
            productUI.mo129961J7(10001, "");
            Intent intent = new Intent();
            intent.setClass(productUI, ProductFurtherInfoUI.class);
            intent.putExtra("key_Product_xml", productUI.f273242q.field_xml);
            intent.putExtra("key_title", productUI.f273220E);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(productUI, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "toProductDetail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            productUI.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(productUI, "com/tencent/mm/plugin/scanner/ui/ProductUI", "toProductDetail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: I7 */
    public final void mo129960I7(String str) {
        int i = 47;
        if (mo129964M7(str)) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            if (this.f273244s != 3) {
                i = 49;
            }
            intent.putExtra("add_scene", i);
            ((C67654r1) C5176w.m5203a()).mo93173f(intent, getContext());
        } else if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.scanner.ProductUI", "username is null");
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("force_get_contact", true);
            if (this.f273244s != 3) {
                i = 49;
            }
            intent2.putExtra("Contact_Scene", i);
            ((C67654r1) C5176w.m5203a()).mo93174g(intent2, this);
        }
    }

    /* renamed from: J7 */
    public final void mo129961J7(int i, String str) {
        C102216y.C102217a aVar = this.f273242q;
        if (aVar != null) {
            C86709a0.m107524d().mo123460f(new C115673w(aVar.field_productid, "", i, str, 0, 11294, 0, (String) null));
        }
    }

    /* renamed from: K7 */
    public final void mo129962K7() {
        if (this.f273242q != null) {
            Log.m105924i("MicroMsg.scanner.ProductUI", "doUpdateActionLogic, flag=:" + this.f273242q.field_getaction);
            C102216y.C102217a aVar = this.f273242q;
            int i = aVar.field_getaction;
            if ((i & 2) > 0) {
                C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
                this.f273223H = ms;
                if (ms != null) {
                    ms.mo126409c(this.f273226K, true, false);
                    C5139t.m5183e(22, 10);
                }
            } else if ((i & 1) > 0) {
                C86709a0.m107524d().mo123460f(new C42908r(this.f273217B, C94476b0.m119499a(aVar.f300996a), this.f273246u, this.f273218C, 0.0d, 0.0d));
            }
        }
    }

    /* renamed from: L7 */
    public final void mo129963L7(String str, String str2, boolean z) {
        this.f273217B = str;
        this.f273218C = str2;
        C42909s sVar = new C42909s(str, this.f273246u, str2);
        C86709a0.m107524d().mo123460f(sVar);
        if (!z) {
            this.f273249x = C76879j.m92724R(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f361235id1), true, true, new C94496f(this, sVar));
        }
    }

    /* renamed from: M7 */
    public final boolean mo129964M7(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        return z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3();
    }

    /* renamed from: N7 */
    public final void mo129965N7(C102216y.C102217a aVar) {
        LinkedList<C94474a> linkedList;
        C47511g gVar;
        LinkedList<C94474a.C94475a> linkedList2;
        boolean z;
        int i;
        C102216y.C102217a aVar2 = aVar;
        if (aVar2 != null && (linkedList = aVar2.f300996a) != null && linkedList.size() != 0 && (gVar = this.f273232d) != null) {
            gVar.removeAll();
            for (int i2 = 0; i2 < aVar2.f300996a.size(); i2++) {
                C94474a aVar3 = aVar2.f300996a.get(i2);
                if (!(aVar3 == null || (linkedList2 = aVar3.f273158f) == null || linkedList2.size() == 0 || aVar3.f273155c == 1 || !aVar3.f273157e)) {
                    if (i2 != 0) {
                        Preference preference = new Preference(this);
                        preference.f121271G = C0966R.C0971layout.bnt;
                        this.f273232d.mo72527k(preference);
                    }
                    AttributeSet attributeSet = null;
                    if (!Util.isNullOrNil(aVar3.f273154b) && ((i = aVar3.f273153a) == 6 || i == 7)) {
                        CategoryWithTitlePreference categoryWithTitlePreference = new CategoryWithTitlePreference(this, (AttributeSet) null);
                        categoryWithTitlePreference.mo69924H(aVar3.f273154b);
                        this.f273232d.mo72527k(categoryWithTitlePreference);
                    }
                    if (aVar3.f273153a == 6) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < aVar3.f273158f.size(); i3++) {
                            C94474a.C94475a aVar4 = aVar3.f273158f.get(i3);
                            if (aVar4.f273159a == 10) {
                                arrayList.add(aVar4);
                            }
                        }
                        if (arrayList.size() > 0) {
                            C94519g gVar2 = new C94519g(this);
                            gVar2.mo26273A((i2 * 100) + "");
                            gVar2.f273331L = arrayList;
                            this.f273232d.mo72527k(gVar2);
                        }
                    } else {
                        int i4 = 0;
                        while (i4 < aVar3.f273158f.size()) {
                            String str = "" + ((i2 * 100) + i4);
                            C94474a.C94475a aVar5 = aVar3.f273158f.get(i4);
                            int i5 = aVar5.f273159a;
                            if (i5 == 11) {
                                this.f273219D = true;
                                this.f273220E = aVar5.f273160b;
                            }
                            int i6 = aVar5.f273166h;
                            if (i6 != 2) {
                                if (i6 != 1) {
                                    if (i5 == 5) {
                                        MusicPreference musicPreference = new MusicPreference(this, attributeSet);
                                        musicPreference.mo26273A(str);
                                        musicPreference.mo69924H(aVar5.f273160b);
                                        String str2 = aVar5.f273169k;
                                        musicPreference.f273196N = str2;
                                        musicPreference.f273197P = aVar5.f273170l;
                                        musicPreference.f273198Q = aVar5.f273171m;
                                        if (!mo129966O7(String.format("%s_cd_%s", new Object[]{str2, str}))) {
                                            musicPreference.mo129953I(false);
                                        } else {
                                            musicPreference.mo129953I(true);
                                        }
                                        musicPreference.f273199R = this.f273228M;
                                        this.f273232d.mo72527k(musicPreference);
                                        this.f273231Q.alive();
                                        if (this.f273229N == null) {
                                            this.f273229N = new ArrayList();
                                        }
                                        if (this.f273230P) {
                                            this.f273229N.add(musicPreference);
                                        }
                                    } else if (i5 == 6) {
                                        C94515d dVar = new C94515d(this);
                                        dVar.mo26273A(str);
                                        dVar.f273322R = aVar5.f273160b;
                                        dVar.mo7741E(aVar5.f273161c);
                                        this.f273232d.mo72527k(dVar);
                                        dVar.f273326V = this.f273216A;
                                    } else if (i5 == 12) {
                                        C71017e eVar = new C71017e(this);
                                        eVar.mo26273A(str);
                                        eVar.f205528L = aVar5.f273168j;
                                        C47511g gVar3 = this.f273232d;
                                        eVar.f205530N = gVar3;
                                        gVar3.mo72527k(eVar);
                                    } else if (i5 == 2) {
                                        String str3 = mo129964M7(aVar5.f273163e) ? aVar5.f273177s : aVar5.f273176r;
                                        C71013a aVar6 = new C71013a(this);
                                        aVar6.mo26273A(str);
                                        aVar6.mo69924H(str3);
                                        aVar6.mo7741E(aVar5.f273161c);
                                        aVar6.f205511N = aVar5.f273165g;
                                        this.f273232d.mo72527k(aVar6);
                                    } else if (i5 == 22) {
                                        C71016c cVar = new C71016c(this);
                                        cVar.mo26273A(str);
                                        if (!Util.isNullOrNil(aVar5.f273164f)) {
                                            cVar.f205525Q = aVar5.f273164f + XVFSFile.PATH_SEPARATOR;
                                        }
                                        cVar.f205524P = aVar5.f273179u;
                                        cVar.f205523N = aVar5.f273168j;
                                        this.f273232d.mo72527k(cVar);
                                    } else {
                                        C71013a aVar7 = new C71013a(this);
                                        aVar7.mo26273A(str);
                                        aVar7.mo69924H(aVar5.f273160b);
                                        aVar7.mo7741E(aVar5.f273161c);
                                        aVar7.f205511N = aVar5.f273165g;
                                        aVar7.f205510M = aVar5.f273181w;
                                        this.f273232d.mo72527k(aVar7);
                                    }
                                    if (i4 < aVar3.f273158f.size() - 1 && aVar5.f273159a != 12) {
                                        int i7 = i4 + 1;
                                        if (!(aVar3.f273158f.get(i7).f273159a == 12 || aVar3.f273158f.get(i7).f273166h == 1)) {
                                            LinkedList<C94474a.C94475a> linkedList3 = aVar3.f273158f;
                                            if (linkedList3 != null) {
                                                while (true) {
                                                    if (i7 >= linkedList3.size()) {
                                                        break;
                                                    } else if (linkedList3.get(i7).f273166h != 2) {
                                                        z = true;
                                                        break;
                                                    } else {
                                                        i7++;
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (z) {
                                                this.f273232d.mo72527k(new C71019f(this));
                                            }
                                        }
                                    }
                                } else if (!Util.isNullOrNil(aVar5.f273167i)) {
                                    C71015b bVar = new C71015b(this);
                                    bVar.mo26273A(str);
                                    bVar.f205516L = aVar5.f273167i;
                                    C47511g gVar4 = this.f273232d;
                                    bVar.f205518N = gVar4;
                                    gVar4.mo72527k(bVar);
                                }
                            }
                            i4++;
                            attributeSet = null;
                        }
                    }
                }
            }
            this.f273232d.notifyDataSetChanged();
            Log.m105918d("MicroMsg.scanner.ProductUI", "initBodyView finish");
            if (this.f273229N != null) {
                this.f273230P = false;
            }
        }
    }

    /* renamed from: O7 */
    public final boolean mo129966O7(String str) {
        C101106m b = C101093a.m132480b();
        return b != null && b.f295959d == 5 && str.equals(b.f295960e) && C101093a.m132481c();
    }

    /* renamed from: P7 */
    public final void mo129967P7(C102216y.C102217a aVar, boolean z) {
        int i;
        C102216y.C102217a aVar2 = aVar;
        if (aVar2 == null) {
            Log.m105920e("MicroMsg.scanner.ProductUI", "refreshViewByProduct(), pd == null");
            finish();
            return;
        }
        if (!Util.isNullOrNil(aVar2.field_thumburl)) {
            this.f273250y = new C71012o(aVar2);
        }
        this.f273247v = getContext().getResources().getDimensionPixelSize(C0966R.dimen.ajr);
        C102216y.C102217a aVar3 = this.f273242q;
        if (aVar3 != null && ((i = aVar3.field_type) == 1 || i == 2)) {
            this.f273247v = getContext().getResources().getDimensionPixelSize(C0966R.dimen.ajs);
            ViewGroup.LayoutParams layoutParams = this.f273234f.getLayoutParams();
            layoutParams.height = this.f273247v;
            this.f273234f.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f273235g.getLayoutParams();
            layoutParams2.height = this.f273247v;
            this.f273241p.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.i3l);
            ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            layoutParams3.height = this.f273247v;
            relativeLayout.setLayoutParams(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = this.f273241p.getLayoutParams();
            layoutParams4.height = this.f273247v;
            this.f273241p.setLayoutParams(layoutParams4);
        }
        if (Util.isNullOrNil(aVar2.field_introtitle) || Util.isNullOrNil(aVar2.field_introlink)) {
            this.f273240o.setVisibility(8);
        } else {
            this.f273240o.setText(aVar2.field_introtitle);
            this.f273240o.setOnClickListener(new C85413m(aVar2));
            this.f273240o.setVisibility(0);
        }
        this.f273244s = this.f273242q.field_functionType;
        int i2 = aVar2.field_xmlType;
        if (i2 == 3) {
            this.f273236h.setText(aVar2.field_title);
            if (!Util.isNullOrNil(aVar2.field_certification)) {
                this.f273237i.setText(aVar2.field_certification);
                this.f273238j.setVisibility(0);
            } else {
                this.f273237i.setText(aVar2.field_source);
                this.f273238j.setVisibility(8);
                this.f273239n.setOnClickListener((View.OnClickListener) null);
                this.f273239n.setBackgroundDrawable((Drawable) null);
                this.f273239n.setFocusable(false);
            }
            int i3 = aVar2.field_type;
            if (i3 == 1 || i3 == 2) {
                this.f273233e = (ImageView) findViewById(C0966R.C0970id.i3n);
                View findViewById = findViewById(C0966R.C0970id.i3n);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.i3q);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f273233e = (ImageView) findViewById(C0966R.C0970id.i3q);
                View findViewById3 = findViewById(C0966R.C0970id.i3q);
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar6.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar6.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = findViewById(C0966R.C0970id.i3n);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar7.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!Util.isNullOrNil(aVar2.field_playurl)) {
                ImageView imageView = (ImageView) findViewById(C0966R.C0970id.i3j);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new C85414n(aVar2));
            }
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C94492b());
        } else if (i2 == 4) {
            this.f273233e = (ImageView) findViewById(C0966R.C0970id.i3q);
            View findViewById5 = findViewById(C0966R.C0970id.i3q);
            C9556a aVar8 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar8.mo10233c(0);
            View view5 = findViewById5;
            C117292a.m165358d(view5, aVar8.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById6 = findViewById(C0966R.C0970id.i3n);
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            View view6 = findViewById6;
            C117292a.m165358d(view6, aVar9.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273233e.setImageResource(C0966R.raw.scan_without_commodity_icon);
            this.f273233e.setBackgroundResource(C0966R.raw.scan_without_commodity_icon);
            this.f273236h.setText(C0966R.string.ics);
            this.f273237i.setText((CharSequence) null);
        }
        Log.m105926v("MicroMsg.scanner.ProductUI", "start postToMainThread initBodyView");
        MMHandlerThread.postToMainThread(new C94493c(aVar2));
    }

    /* renamed from: Q7 */
    public final void mo129968Q7() {
        LinkedList<C94474a> linkedList;
        LinkedList<C94474a.C94475a> linkedList2;
        C102216y.C102217a aVar = this.f273242q;
        if (aVar != null && (linkedList = aVar.f300996a) != null && linkedList.size() != 0 && this.f273232d != null) {
            for (int i = 0; i < this.f273242q.f300996a.size(); i++) {
                C94474a aVar2 = this.f273242q.f300996a.get(i);
                if (!(aVar2 == null || (linkedList2 = aVar2.f273158f) == null || linkedList2.size() == 0)) {
                    for (int i2 = 0; i2 < aVar2.f273158f.size(); i2++) {
                        C94474a.C94475a aVar3 = aVar2.f273158f.get(i2);
                        if (aVar3.f273159a == 5) {
                            String str = "" + ((i * 100) + i2);
                            MusicPreference musicPreference = (MusicPreference) this.f273232d.mo72519a(str);
                            if (musicPreference != null) {
                                if (!mo129966O7(String.format("%s_cd_%s", new Object[]{aVar3.f273169k, str}))) {
                                    musicPreference.mo129953I(false);
                                } else {
                                    musicPreference.mo129953I(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f273232d.notifyDataSetChanged();
        }
    }

    /* renamed from: R7 */
    public final void mo129969R7(View view, float f) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: S7 */
    public final void mo129970S7(String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("jsapi_args_appid", C94481y.m119504a(this.f273244s));
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("pay_channel", 3);
        int i = this.f273244s;
        intent.putExtra("geta8key_scene", i == 4 ? 11 : i == 3 ? 12 : 0);
        C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: T7 */
    public final void mo129971T7() {
        Class cls = C75700k0.class;
        long longExtra = getIntent().getLongExtra("key_ProductUI_chatting_msgId", 0);
        this.f273245t = longExtra;
        if (longExtra > 0 && C86709a0.m107522a()) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f273245t);
            if (b002.getMsgId() > 0) {
                b002.mo108739S2(this.f273250y.mo94827k());
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f273245t, b002);
            }
        }
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.f359930bo2;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnv;
    }

    public int getResourceId() {
        return C0966R.xml.f8926bj;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f361237ie1);
        this.f273232d = getPreferenceScreen();
        String str = null;
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91112w((Drawable) null);
            getSupportActionBar().mo91099j();
        }
        setBackBtn(new C94499h());
        this.f273236h = (TextView) findViewById(C0966R.C0970id.i46);
        this.f273234f = (ImageView) findViewById(C0966R.C0970id.i3k);
        this.f273235g = findViewById(C0966R.C0970id.i3p);
        this.f273238j = (ImageView) findViewById(C0966R.C0970id.i3d);
        this.f273243r = findViewById(C0966R.C0970id.i3_);
        this.f273241p = (LinearLayout) findViewById(C0966R.C0970id.i3o);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.i3m);
        this.f273239n = findViewById(C0966R.C0970id.i3c);
        mo129969R7(this.f273243r, 0.0f);
        if (C76577a.m92147C(getContext())) {
            this.f273236h.setTextSize(0, ((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3693bm)) * C76577a.m92174y(getContext()));
        } else {
            this.f273236h.setTextSize(0, (float) C76577a.m92157h(getContext(), C0966R.dimen.f3693bm));
        }
        this.f273237i = (TextView) findViewById(C0966R.C0970id.i3b);
        this.f273240o = (TextView) findViewById(C0966R.C0970id.j1q);
        this.f273251z = new HashMap<>();
        this.f273216A = new C94500i();
        C32073a aVar = new C32073a();
        this.f273222G = aVar;
        aVar.field_ScanTime = System.currentTimeMillis();
        C32073a aVar2 = this.f273222G;
        int i = this.f273246u;
        aVar2.field_scene = i;
        if (i == 5) {
            this.f273221F = true;
            String stringExtra = getIntent().getStringExtra("key_Qrcode_Url");
            if (!Util.isNullOrNil(stringExtra)) {
                try {
                    str = Uri.parse(stringExtra).getQueryParameter("p");
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.scanner.ProductUI", stringExtra + ";" + e.getLocalizedMessage());
                }
            }
            C32073a aVar3 = this.f273222G;
            aVar3.field_qrcodeUrl = stringExtra;
            aVar3.field_productId = str;
            mo129963L7(str, stringExtra, false);
        } else if (i == 4) {
            String stringExtra2 = getIntent().getStringExtra("key_product_id");
            String stringExtra3 = getIntent().getStringExtra("key_Qrcode_Url");
            if (!Util.isNullOrNil(stringExtra2)) {
                mo129963L7(stringExtra2, stringExtra3, false);
            } else {
                Log.m105920e("MicroMsg.scanner.ProductUI", "jsapi jump finish productId null");
                finish();
                return;
            }
        } else {
            getIntent().getBooleanExtra("key_is_from_barcode", false);
            this.f273221F = getIntent().getBooleanExtra("key_need_add_to_history", false);
            String stringExtra4 = getIntent().getStringExtra("key_Product_xml");
            if (!Util.isNullOrNil(stringExtra4)) {
                int intExtra = getIntent().getIntExtra("key_Product_funcType", 0);
                C102216y.C102217a b = C94481y.m119505b(stringExtra4, intExtra);
                this.f273242q = b;
                if (b == null) {
                    Log.m105920e("MicroMsg.scanner.ProductUI", "initView(), product == null");
                    finish();
                    return;
                }
                String str2 = b.field_productid;
                this.f273217B = str2;
                this.f273218C = b.field_extinfo;
                if (!this.f273221F || TextUtils.isEmpty(str2)) {
                    Log.m105924i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.f273221F + " mProductId:" + this.f273217B);
                } else {
                    C32073a aVar4 = this.f273222G;
                    aVar4.field_xmlContent = stringExtra4;
                    aVar4.field_qrcodeUrl = this.f273218C;
                    aVar4.field_productId = this.f273217B;
                    aVar4.field_funcType = intExtra;
                    Log.m105920e("MicroMsg.scanner.ProductUI", "mHistoryItem ScanHistoryUtil.shouldShowHistoryList() is false!");
                }
                mo129967P7(this.f273242q, getIntent().getBooleanExtra("key_ProductUI_addToDB", true));
                if (intExtra != 0 || Util.isNullOrNil(this.f273242q.field_productid)) {
                    mo129962K7();
                } else {
                    C102216y.C102217a aVar5 = this.f273242q;
                    mo129963L7(aVar5.field_productid, aVar5.field_extinfo, true);
                }
            } else {
                String stringExtra5 = getIntent().getStringExtra("key_Product_ID");
                if (!Util.isNullOrNil(stringExtra5)) {
                    mo129963L7(stringExtra5, (String) null, false);
                } else {
                    Log.m105920e("MicroMsg.scanner.ProductUI", "normal finish productId null");
                    finish();
                    return;
                }
            }
        }
        findViewById(C0966R.C0970id.i3r).setOnClickListener(new C94501j());
        findViewById(C0966R.C0970id.i3g).setOnClickListener(new C94502k());
        this.f273239n.setOnClickListener(new C94503l());
        new C94504p();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (!Util.isNullOrNil(str) && this.f273242q != null && bitmap != null && !bitmap.isRecycled()) {
            Log.m105918d("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + str);
            MMHandlerThread.postToMainThread(new C94495e(str, bitmap));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f273248w = Util.nowSecond();
        this.f273246u = getIntent().getIntExtra("key_ProductUI_getProductInfoScene", 0);
        ((C102720b) C86312j.m106911c(C102720b.class)).U70(this);
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120968d("scanproductinfo", this.f273227L, true);
        initView();
    }

    public void onDestroy() {
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this);
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120966D("scanproductinfo", this.f273227L, true);
        this.f273231Q.dead();
        C92411b bVar = this.f273223H;
        if (bVar != null) {
            bVar.mo126408b(this.f273226K);
        }
        mo129961J7(10100, (Util.nowSecond() - this.f273248w) + "");
        super.onDestroy();
    }

    public void onPause() {
        C86709a0.m107524d().mo123470p(1063, this);
        C86709a0.m107524d().mo123470p(WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID, this);
        super.onPause();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0150, code lost:
        r19 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceTreeClick(pj3.C47511g r25, com.tencent.p014mm.p136ui.base.preference.Preference r26) {
        /*
            r24 = this;
            r9 = r24
            r0 = r26
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = r0.f121285r
            r11 = 0
            r1[r11] = r2
            java.lang.String r12 = "MicroMsg.scanner.ProductUI"
            java.lang.String r2 = "onPreferenceTreeClick item: [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            vl2.y$a r1 = r9.f273242q
            if (r1 == 0) goto L_0x028f
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a> r1 = r1.f300996a
            if (r1 != 0) goto L_0x001e
            goto L_0x028f
        L_0x001e:
            java.lang.String r0 = r0.f121285r     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0278 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0278 }
            int r1 = r0 / 100
            int r2 = r0 % 100
            java.lang.String r3 = "keyId=[%s], ii=[%s], jj=[%s]"
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0278 }
            r5[r11] = r0     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0278 }
            r5[r10] = r0     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0278 }
            r6 = 2
            r5[r6] = r0     // Catch:{ Exception -> 0x0278 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r3, r5)     // Catch:{ Exception -> 0x0278 }
            if (r1 < 0) goto L_0x025c
            vl2.y$a r0 = r9.f273242q     // Catch:{ Exception -> 0x0278 }
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a> r0 = r0.f300996a     // Catch:{ Exception -> 0x0278 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0278 }
            if (r1 < r0) goto L_0x0056
            goto L_0x025c
        L_0x0056:
            vl2.y$a r0 = r9.f273242q     // Catch:{ Exception -> 0x0278 }
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a> r0 = r0.f300996a     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0278 }
            com.tencent.mm.plugin.scanner.model.a r0 = (com.tencent.p014mm.plugin.scanner.model.C94474a) r0     // Catch:{ Exception -> 0x0278 }
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "actionList == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)     // Catch:{ Exception -> 0x0278 }
            return r11
        L_0x0068:
            if (r2 < 0) goto L_0x0242
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a$a> r1 = r0.f273158f     // Catch:{ Exception -> 0x0278 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0278 }
            if (r2 < r1) goto L_0x0074
            goto L_0x0242
        L_0x0074:
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a$a> r1 = r0.f273158f     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0278 }
            r13 = r1
            com.tencent.mm.plugin.scanner.model.a$a r13 = (com.tencent.p014mm.plugin.scanner.model.C94474a.C94475a) r13     // Catch:{ Exception -> 0x0278 }
            if (r13 != 0) goto L_0x0085
            java.lang.String r0 = "action == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)     // Catch:{ Exception -> 0x0278 }
            return r11
        L_0x0085:
            java.lang.String r1 = "action.type = [%s]"
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0278 }
            int r3 = r13.f273159a     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0278 }
            r2[r11] = r3     // Catch:{ Exception -> 0x0278 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r2)     // Catch:{ Exception -> 0x0278 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0278 }
            r1.<init>()     // Catch:{ Exception -> 0x0278 }
            int r2 = r13.f273159a     // Catch:{ Exception -> 0x0278 }
            r3 = 21
            java.lang.String r5 = "key_Product_xml"
            r14 = 0
            if (r2 == r3) goto L_0x01bd
            r3 = 22
            if (r2 == r3) goto L_0x01af
            r3 = 12
            switch(r2) {
                case 1: goto L_0x01af;
                case 2: goto L_0x017e;
                case 3: goto L_0x01af;
                case 4: goto L_0x017e;
                case 5: goto L_0x0154;
                case 6: goto L_0x0216;
                case 7: goto L_0x0216;
                case 8: goto L_0x012f;
                case 9: goto L_0x0110;
                case 10: goto L_0x0216;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00b0;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            goto L_0x018d
        L_0x00b0:
            java.lang.String r14 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0278 }
            if (r1 != 0) goto L_0x0216
            java.lang.String r1 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            r9.mo129970S7(r1)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0216
        L_0x00bf:
            java.lang.Class<com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI> r2 = com.tencent.p014mm.plugin.scanner.p101ui.ProductFurtherInfoUI.class
            r1.setClass(r9, r2)     // Catch:{ Exception -> 0x0278 }
            vl2.y$a r2 = r9.f273242q     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = r2.field_xml     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r5, r2)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "key_title"
            java.lang.String r3 = r13.f273160b     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x0278 }
            k20.a r15 = new k20.a     // Catch:{ Exception -> 0x0278 }
            r15.<init>()     // Catch:{ Exception -> 0x0278 }
            r15.mo10233c(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.Object[] r2 = r15.mo10232b()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "com/tencent/mm/plugin/scanner/ui/ProductUI"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r1 = r15.mo10231a(r11)     // Catch:{ Exception -> 0x0278 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x0278 }
            r9.startActivity(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "com/tencent/mm/plugin/scanner/ui/ProductUI"
            java.lang.String r3 = "onPreferenceTreeClick"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0216
        L_0x0110:
            java.lang.String r2 = r13.f273173o     // Catch:{ Exception -> 0x0278 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0278 }
            if (r4 != 0) goto L_0x0150
            java.lang.String r4 = "key_product_id"
            java.lang.String r5 = r13.f273173o     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = "key_product_scene"
            r1.putExtra(r4, r3)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "product"
            java.lang.String r4 = ".ui.MallProductUI"
            ke3.C88144b.m109791i(r9, r3, r4, r1, r14)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0150
        L_0x012f:
            java.lang.String r2 = r13.f273173o     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "key_card_id"
            java.lang.String r4 = r13.f273175q     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r3, r4)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "key_card_ext"
            java.lang.String r4 = r13.f273174p     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r3, r4)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "key_from_scene"
            r4 = 9
            r1.putExtra(r3, r4)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "card"
            java.lang.String r4 = ".ui.CardDetailUI"
            ke3.C88144b.m109791i(r9, r3, r4, r1, r14)     // Catch:{ Exception -> 0x0278 }
        L_0x0150:
            r19 = r2
            goto L_0x0218
        L_0x0154:
            java.lang.String r14 = r13.f273171m     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "rawUrl"
            r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "geta8key_scene"
            int r5 = r9.f273244s     // Catch:{ Exception -> 0x0278 }
            r6 = 4
            if (r5 != r6) goto L_0x0166
            r3 = 11
            goto L_0x016a
        L_0x0166:
            if (r5 != r4) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r3 = 0
        L_0x016a:
            r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x0278 }
            wc3.z r2 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()     // Catch:{ Exception -> 0x0278 }
            com.tencent.mm.app.r1 r2 = (com.tencent.p014mm.app.C67654r1) r2     // Catch:{ Exception -> 0x0278 }
            r2.mo93190w(r1, r9)     // Catch:{ Exception -> 0x0278 }
            qc0.C101093a.m132490l()     // Catch:{ Exception -> 0x0278 }
            r24.mo129968Q7()     // Catch:{ Exception -> 0x0278 }
            goto L_0x0216
        L_0x017e:
            java.lang.String r14 = r13.f273163e     // Catch:{ Exception -> 0x0278 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0278 }
            if (r1 != 0) goto L_0x0216
            java.lang.String r1 = r13.f273163e     // Catch:{ Exception -> 0x0278 }
            r9.mo129960I7(r1)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0216
        L_0x018d:
            r1.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "Default go url:"
            r1.append(r2)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            r1.append(r2)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0278 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r1 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0278 }
            if (r1 != 0) goto L_0x0216
            java.lang.String r1 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            r9.mo129970S7(r1)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0216
        L_0x01af:
            java.lang.String r14 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0278 }
            if (r1 != 0) goto L_0x0216
            java.lang.String r1 = r13.f273162d     // Catch:{ Exception -> 0x0278 }
            r9.mo129970S7(r1)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0216
        L_0x01bd:
            java.lang.String r14 = r13.f273180v     // Catch:{ Exception -> 0x0278 }
            java.lang.Class<com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI> r2 = com.tencent.p014mm.plugin.scanner.p101ui.ProductPurchaseAreaUI.class
            r1.setClass(r9, r2)     // Catch:{ Exception -> 0x0278 }
            vl2.y$a r2 = r9.f273242q     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = r2.field_xml     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r5, r2)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "referkey"
            java.lang.String r3 = r13.f273180v     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "key_Product_funcType"
            int r3 = r9.f273244s     // Catch:{ Exception -> 0x0278 }
            r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x0278 }
            k20.a r15 = new k20.a     // Catch:{ Exception -> 0x0278 }
            r15.<init>()     // Catch:{ Exception -> 0x0278 }
            r15.mo10233c(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.Object[] r2 = r15.mo10232b()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "com/tencent/mm/plugin/scanner/ui/ProductUI"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r1 = r15.mo10231a(r11)     // Catch:{ Exception -> 0x0278 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x0278 }
            r9.startActivity(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "com/tencent/mm/plugin/scanner/ui/ProductUI"
            java.lang.String r3 = "onPreferenceTreeClick"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0278 }
        L_0x0216:
            r19 = r14
        L_0x0218:
            com.tencent.mm.plugin.scanner.model.w r1 = new com.tencent.mm.plugin.scanner.model.w     // Catch:{ Exception -> 0x0278 }
            vl2.y$a r2 = r9.f273242q     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = r2.field_productid     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = r13.f273172n     // Catch:{ Exception -> 0x0278 }
            int r4 = r13.f273159a     // Catch:{ Exception -> 0x0278 }
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a$a> r0 = r0.f273158f     // Catch:{ Exception -> 0x0278 }
            int r20 = r0.size()     // Catch:{ Exception -> 0x0278 }
            r21 = 11294(0x2c1e, float:1.5826E-41)
            int r0 = r13.f273166h     // Catch:{ Exception -> 0x0278 }
            r23 = 0
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r22 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0278 }
            ob0.b0 r0 = f40.C86709a0.m107524d()     // Catch:{ Exception -> 0x0278 }
            r0.mo123460f(r1)     // Catch:{ Exception -> 0x0278 }
            return r10
        L_0x0242:
            java.lang.String r1 = "index out of bounds, jj=[%s], actions Size=[%s]"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0278 }
            r3[r11] = r2     // Catch:{ Exception -> 0x0278 }
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a$a> r0 = r0.f273158f     // Catch:{ Exception -> 0x0278 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0278 }
            r3[r10] = r0     // Catch:{ Exception -> 0x0278 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r1, r3)     // Catch:{ Exception -> 0x0278 }
            return r11
        L_0x025c:
            java.lang.String r0 = "index out of bounds, ii=[%s], list Size=[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0278 }
            r2[r11] = r1     // Catch:{ Exception -> 0x0278 }
            vl2.y$a r1 = r9.f273242q     // Catch:{ Exception -> 0x0278 }
            java.util.LinkedList<com.tencent.mm.plugin.scanner.model.a> r1 = r1.f300996a     // Catch:{ Exception -> 0x0278 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0278 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0278 }
            r2[r10] = r1     // Catch:{ Exception -> 0x0278 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r2)     // Catch:{ Exception -> 0x0278 }
            return r11
        L_0x0278:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = r0.getMessage()
            r1[r11] = r2
            java.lang.String r2 = "onPreferenceTreeClick, [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r2, r1)
            return r11
        L_0x028f:
            java.lang.String r0 = "product == null || product.actionlist == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.onPreferenceTreeClick(pj3.g, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(1063, this);
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        String str3;
        C47465a aVar;
        if (yVar == null) {
            Log.m105928w("MicroMsg.scanner.ProductUI", "scene == null");
            return;
        }
        C52254zf zfVar = null;
        if (yVar.getType() == 1063) {
            if (i == 0 && i2 == 0) {
                C47350c cVar = ((C42909s) yVar).f116183e;
                if (!(cVar == null || (aVar = cVar.f127056b.f127083a) == null)) {
                    zfVar = (C52254zf) aVar;
                }
                if (zfVar == null) {
                    Log.m105928w("MicroMsg.scanner.ProductUI", "onSceneEnd productInfo == null");
                } else if (zfVar.f145856e != null) {
                    Log.m105918d("MicroMsg.scanner.ProductUI", "onSceneEnd  productInfo.DescXML != null");
                    C102216y.C102217a b = C94481y.m119505b(zfVar.f145856e, this.f273244s);
                    C102216y.C102217a aVar2 = this.f273242q;
                    if (aVar2 != null && (str2 = aVar2.field_xml) != null && b != null && (str3 = b.field_xml) != null && !str2.equals(str3)) {
                        this.f273242q = b;
                        mo129967P7(b, true);
                    } else if (!(b == null || b.field_xml == null)) {
                        this.f273242q = b;
                        mo129967P7(b, true);
                    }
                    ProgressDialog progressDialog = this.f273249x;
                    if (progressDialog != null && progressDialog.isShowing()) {
                        this.f273249x.dismiss();
                    }
                    mo129962K7();
                    if (!this.f273221F || TextUtils.isEmpty(this.f273217B)) {
                        Log.m105924i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.f273221F + " mProductId:" + this.f273217B + "  hasAddToHistory:" + false);
                        return;
                    }
                    C32073a aVar3 = this.f273222G;
                    aVar3.field_xmlContent = zfVar.f145856e;
                    aVar3.field_funcType = this.f273244s;
                    Log.m105920e("MicroMsg.scanner.ProductUI", "mHistoryItem ScanHistoryUtil.shouldShowHistoryList() is false!");
                }
            } else {
                Log.m105921e("MicroMsg.scanner.ProductUI", "onSceneEnd() errType = [%s], errCode = [%s]", Integer.valueOf(i), Integer.valueOf(i2));
            }
        } else if (yVar.getType() == 1068 && i == 0 && i2 == 0) {
            LinkedList<String> linkedList = ((C51964xf) ((C42908r) yVar).f116181e.f127056b.f127083a).f144630e;
            C102216y.C102217a aVar4 = this.f273242q;
            if (aVar4 != null) {
                LinkedList<C94474a> linkedList2 = aVar4.f300996a;
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < linkedList.size(); i3++) {
                    String str4 = linkedList.get(i3);
                    Log.m105918d("MicroMsg.ProductUpdateLogic", "toUpdateXmlList info: i=" + i3 + ";" + Util.nullAsNil(str4));
                    C94474a.C94475a a = C94474a.m119497a(XmlParser.parseXml(str4, "action", (String) null), ".action");
                    if (!(a == null || a.f273166h == 2)) {
                        hashMap.put(a.f273178t, a);
                    }
                }
                if (C94476b0.m119500b(linkedList2, hashMap)) {
                    mo129965N7(this.f273242q);
                }
            }
        }
    }
}
