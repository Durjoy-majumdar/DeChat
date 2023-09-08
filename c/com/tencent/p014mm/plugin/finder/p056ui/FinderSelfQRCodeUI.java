package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.utils.TPGlobalEventNofication;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58741j5;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import je1.C9314h4;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kj2.C117407d;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p159gw.C98250h;
import p196ln.C76708i;
import p200lx.C76736w;
import pe3.C47465a;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49994ji1;
import te3.C64284cg;
import tf0.C64916p1;
import up1.C27696y;
import wc1.C15113q;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI */
public final class FinderSelfQRCodeUI extends MMFinderUI implements C11385n {

    /* renamed from: B */
    public static final /* synthetic */ int f17035B = 0;

    /* renamed from: A */
    public final int f17036A = TPGlobalEventNofication.EVENT_ID_UPC_CHANGED;

    /* renamed from: o */
    public final String f17037o = "Finder.FinderSelfQRCodeUI";

    /* renamed from: p */
    public ImageView f17038p;

    /* renamed from: q */
    public TextView f17039q;

    /* renamed from: r */
    public ImageView f17040r;

    /* renamed from: s */
    public TextView f17041s;

    /* renamed from: t */
    public ImageView f17042t;

    /* renamed from: u */
    public View f17043u;

    /* renamed from: v */
    public ProgressBar f17044v;

    /* renamed from: w */
    public View f17045w;

    /* renamed from: x */
    public ImageView f17046x;

    /* renamed from: y */
    public final int f17047y = 100001;

    /* renamed from: z */
    public final int f17048z = 100002;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI$a */
    public static final class C3712a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfQRCodeUI f17049d;

        /* renamed from: e */
        public final /* synthetic */ C58969q f17050e;

        public C3712a(FinderSelfQRCodeUI finderSelfQRCodeUI, C58969q qVar) {
            this.f17049d = finderSelfQRCodeUI;
            this.f17050e = qVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderSelfQRCodeUI finderSelfQRCodeUI = this.f17049d;
            String username = this.f17050e.getUsername();
            int i = FinderSelfQRCodeUI.f17035B;
            finderSelfQRCodeUI.mo4104N7(username);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI$b */
    public static final class C3713b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfQRCodeUI f17051d;

        public C3713b(FinderSelfQRCodeUI finderSelfQRCodeUI) {
            this.f17051d = finderSelfQRCodeUI;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                e0Var.mo107125a(this.f17051d.f17048z, C0966R.string.f360764el0);
                e0Var.mo107125a(this.f17051d.f17036A, C0966R.string.emx);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI$c */
    public static final class C3714c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfQRCodeUI f17052d;

        /* renamed from: e */
        public final /* synthetic */ C58969q f17053e;

        public C3714c(FinderSelfQRCodeUI finderSelfQRCodeUI, C58969q qVar) {
            this.f17052d = finderSelfQRCodeUI;
            this.f17053e = qVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            FinderSelfQRCodeUI finderSelfQRCodeUI = this.f17052d;
            if (itemId == finderSelfQRCodeUI.f17048z) {
                C7888v2.C7889a.m8055n(C7888v2.f26513a, finderSelfQRCodeUI, this.f17053e, (Bundle) null, 4, (Object) null);
            } else if (itemId == finderSelfQRCodeUI.f17036A) {
                View view = finderSelfQRCodeUI.f17043u;
                if (view != null) {
                    Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(view);
                    if (bitmapFromView != null) {
                        FinderSelfQRCodeUI finderSelfQRCodeUI2 = this.f17052d;
                        C58741j5 j5Var = C58741j5.f168184a;
                        String str = C58741j5.f168192i + System.nanoTime() + ".jpg";
                        BitmapUtil.saveBitmapToImage(bitmapFromView, 80, Bitmap.CompressFormat.JPEG, str, true);
                        finderSelfQRCodeUI2.getClass();
                        ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(finderSelfQRCodeUI2, str, new C3852k3(finderSelfQRCodeUI2));
                        C117407d dVar = C117407d.INSTANCE;
                        dVar.idkeyStat(1278, 7, 1, false);
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                        String O5 = C66785b.f191882e.mo90662O5();
                        y0Var.getClass();
                        C87412m.m108594g(O5, "username");
                        String str2 = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + O5;
                        Log.m105924i(y0Var.f167350d, "18973 " + str2);
                        dVar.kvStat(18973, str2);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("qrcodeContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI$d */
    public static final class C3715d implements C77407n.C47880p {

        /* renamed from: a */
        public static final C3715d f17054a = new C3715d();

        public final void onDismiss() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI$e */
    public static final class C3716e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77407n f17055d;

        public C3716e(C77407n nVar) {
            this.f17055d = nVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17055d.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI$f */
    public static final class C3717f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfQRCodeUI f17056d;

        public C3717f(FinderSelfQRCodeUI finderSelfQRCodeUI) {
            this.f17056d = finderSelfQRCodeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17056d.finish();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 10;
    }

    /* renamed from: N7 */
    public final void mo4104N7(String str) {
        ProgressBar progressBar = this.f17044v;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            View view = this.f17045w;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "doGetQRCodeScene", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "doGetQRCodeScene", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C86709a0.m107524d().mo123460f(new C9314h4(str));
                return;
            }
            C87412m.m108603p("refreshArea");
            throw null;
        }
        C87412m.m108603p("loading");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aph;
    }

    public void initView() {
        CharSequence charSequence;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        View findViewById = findViewById(C0966R.C0970id.d78);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_avatar)");
        this.f17038p = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.e3v);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_nickname)");
        this.f17039q = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.a0g);
        C87412m.m108593f(findViewById3, "findViewById(R.id.auth_icon)");
        this.f17040r = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.a0k);
        C87412m.m108593f(findViewById4, "findViewById(R.id.auth_job)");
        this.f17041s = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.e6a);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder_qrcode)");
        this.f17042t = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.i_o);
        C87412m.m108593f(findViewById6, "findViewById(R.id.qrcode_container)");
        this.f17043u = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.g3k);
        C87412m.m108593f(findViewById7, "findViewById(R.id.loading_progress_bar)");
        this.f17044v = (ProgressBar) findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.e6g);
        C87412m.m108593f(findViewById8, "findViewById(R.id.finder_refresh_qrcode)");
        this.f17045w = findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.e6h);
        C87412m.m108593f(findViewById9, "findViewById(R.id.finder_refresh_qrcode_icon)");
        this.f17046x = (ImageView) findViewById9;
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        if (b != null) {
            C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(b.getAvatarUrl(), (C27696y) null, 2, (C8480h) null);
            ImageView imageView = this.f17038p;
            if (imageView != null) {
                i2.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                TextView textView = this.f17039q;
                if (textView != null) {
                    textView.setText(b.getNickname());
                    FinderAuthInfo finderAuthInfo = b.field_authInfo;
                    int i = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
                    TextView textView2 = this.f17041s;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        C7335d c = C86312j.m106911c(C64916p1.class);
                        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                        C64916p1 p1Var = (C64916p1) c;
                        ImageView imageView2 = this.f17040r;
                        if (imageView2 != null) {
                            C64916p1.C64917a.m76444k(p1Var, imageView2, b.field_authInfo, 0, (C64284cg) null, 12, (Object) null);
                            CharSequence charSequence2 = "";
                            if (i <= 0) {
                                TextView textView3 = this.f17041s;
                                if (textView3 != null) {
                                    textView3.setVisibility(8);
                                } else {
                                    C87412m.m108603p("authJob");
                                    throw null;
                                }
                            } else if (i == 1) {
                                ImageView imageView3 = this.f17040r;
                                if (imageView3 != null) {
                                    imageView3.setVisibility(0);
                                    TextView textView4 = this.f17041s;
                                    if (textView4 != null) {
                                        textView4.setVisibility(0);
                                        TextView textView5 = this.f17041s;
                                        if (textView5 != null) {
                                            FinderAuthInfo finderAuthInfo2 = b.field_authInfo;
                                            if (finderAuthInfo2 == null || (charSequence = finderAuthInfo2.authProfession) == null) {
                                                charSequence = charSequence2;
                                            }
                                            textView5.setText(charSequence);
                                        } else {
                                            C87412m.m108603p("authJob");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("authJob");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("authIcon");
                                    throw null;
                                }
                            } else if (i == 100) {
                                TextView textView6 = this.f17041s;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                } else {
                                    C87412m.m108603p("authJob");
                                    throw null;
                                }
                            }
                            C86709a0.m107524d().mo123455a(258, this);
                            mo4104N7(b.getUsername());
                            ImageView imageView4 = this.f17046x;
                            if (imageView4 != null) {
                                imageView4.setOnClickListener(new C3712a(this, b));
                                C77407n nVar = new C77407n((Context) this, 1, false);
                                nVar.f225771i = new C3713b(this);
                                nVar.f225782p = new C3714c(this, b);
                                nVar.f225761d = C3715d.f17054a;
                                addIconOptionMenu(this.f17047y, C0966R.C0969drawable.bsz, new C3716e(nVar));
                                View view = this.f17043u;
                                if (view != null) {
                                    TextView textView7 = this.f17039q;
                                    if (textView7 != null) {
                                        CharSequence text = textView7.getText();
                                        if (text != null) {
                                            charSequence2 = text;
                                        }
                                        view.setTag(C0966R.C0970id.d58, charSequence2);
                                        return;
                                    }
                                    C87412m.m108603p("nickTv");
                                    throw null;
                                }
                                C87412m.m108603p("qrcodeContainer");
                                throw null;
                            }
                            C87412m.m108603p("refreshIcon");
                            throw null;
                        }
                        C87412m.m108603p("authIcon");
                        throw null;
                    }
                    C87412m.m108603p("authJob");
                    throw null;
                }
                C87412m.m108603p("nickTv");
                throw null;
            }
            C87412m.m108603p("avatarIv");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        initView();
        setBackBtn(new C3717f(this));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderSelfQRCodeUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(258, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f17037o;
        Log.m105924i(str2, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        ProgressBar progressBar = this.f17044v;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            if (i == 0 && i2 == 0) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderQRCode");
                C9314h4 h4Var = (C9314h4) yVar;
                C47350c cVar = h4Var.f29104h;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderQRCodeResponse");
                C89349b bVar = ((C49994ji1) aVar).f136131d;
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bVar != null ? bVar.f257327a : null);
                String str3 = this.f17037o;
                Log.m105924i(str3, "qrcode url " + h4Var.mo10068l1());
                if (decodeByteArray == null) {
                    if (!Util.isNullOrNil(h4Var.mo10068l1())) {
                        String l1 = h4Var.mo10068l1();
                        C87412m.m108591d(l1);
                        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(C66785b.f191882e.mo90662O5());
                        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(N50, false, ((float) N50.getWidth()) * 0.5f);
                        float c = (((float) C74942w4.m89786c(this, C0966R.dimen.f3758d_)) * 1.0f) / ((float) roundedCornerBitmap.getWidth());
                        decodeByteArray = ((C76736w) C86312j.m106911c(C76736w.class)).qk0(this, BitmapUtil.createLayerBitmap(BitmapUtil.rotateAndScale(roundedCornerBitmap, 0.0f, c, c), BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.C0969drawable.a4r)), true), l1, 3, 0.0d);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                if (decodeByteArray != null) {
                    ImageView imageView = this.f17042t;
                    if (imageView != null) {
                        imageView.setImageBitmap(decodeByteArray);
                    } else {
                        C87412m.m108603p("qrcode");
                        throw null;
                    }
                }
            } else {
                View view = this.f17045w;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (Util.isNullOrNil(str)) {
                        str = getString(C0966R.string.gaq);
                    }
                    C76912y0.makeText((Context) this, (CharSequence) str, 1).show();
                    return;
                }
                C87412m.m108603p("refreshArea");
                throw null;
            }
        } else {
            C87412m.m108603p("loading");
            throw null;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15113q.class);
    }
}
