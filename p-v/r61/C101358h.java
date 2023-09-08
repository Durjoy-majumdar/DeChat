package r61;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import i61.C98601f;
import i61.C98602h;
import j20.C117292a;
import j61.C33521l;
import j61.C33522n;
import j61.C46441o;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import p849e3.C107168a0;
import p849e3.C107207u;
import q61.C101037a;
import qo3.C101218e0;
import rx3.C13598b0;
import te3.C101776f80;
import te3.C101824o80;
import te3.C49978jd3;
import te3.C52325zy1;
import u61.C101963g;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: r61.h */
public final class C101358h implements C11385n {

    /* renamed from: d */
    public final Context f296908d;

    /* renamed from: e */
    public EmojiInfo f296909e;

    /* renamed from: f */
    public boolean f296910f;

    /* renamed from: g */
    public C101218e0 f296911g;

    /* renamed from: h */
    public AbsEmojiView f296912h;

    /* renamed from: i */
    public TextView f296913i;

    /* renamed from: j */
    public TextView f296914j;

    /* renamed from: n */
    public View f296915n;

    /* renamed from: o */
    public boolean f296916o;

    /* renamed from: p */
    public C33521l f296917p;

    /* renamed from: q */
    public C46441o f296918q;

    /* renamed from: r */
    public C32224a<C13598b0> f296919r;

    /* renamed from: s */
    public C32224a<C13598b0> f296920s;

    /* renamed from: t */
    public String f296921t;

    /* renamed from: u */
    public int f296922u;

    /* renamed from: v */
    public long f296923v;

    /* renamed from: w */
    public int f296924w = 29;

    /* renamed from: x */
    public int f296925x;

    /* renamed from: y */
    public final String f296926y = "MicroMsg.EmojiStoreV3SingleProductHalfDialog";

    public C101358h(Context context, EmojiInfo emojiInfo, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(emojiInfo, "emojiInfo");
        this.f296908d = context;
        this.f296909e = emojiInfo;
        this.f296910f = z;
        this.f296911g = new C101218e0(context, 3, 1);
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f296909e.field_md5);
        if (TO != null) {
            this.f296909e = TO;
        }
        this.f296916o = this.f296909e.field_catalog == 81;
        mo140840a();
        C101218e0 e0Var = this.f296911g;
        C101352b bVar = new C101352b(this);
        C101353c cVar = new C101353c(this);
        e0Var.f296373D = bVar;
        e0Var.f296374E = cVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b0m, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.f357916iy1);
        C87412m.m108593f(findViewById, "detailView.findViewById(…half_dialog_detail_emoji)");
        AbsEmojiView absEmojiView = (AbsEmojiView) findViewById;
        this.f296912h = absEmojiView;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145191s(absEmojiView, 2);
        AbsEmojiView absEmojiView2 = this.f296912h;
        if (absEmojiView2 != null) {
            absEmojiView2.setStatusListener(new C101354d(this));
            AbsEmojiView absEmojiView3 = this.f296912h;
            if (absEmojiView3 != null) {
                absEmojiView3.setEmojiInfo(this.f296909e);
                String md5 = this.f296909e.getMd5();
                C39343a cm = ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm();
                if (Util.isNullOrNil(md5)) {
                    Log.m105924i("MicroMsg.EmojiStoreV3SingleProductHalfDialog", "no desc, emojiInfo md5 error");
                } else {
                    String T = ((C98602h) cm).mo138012T(md5);
                    T = T == null ? "" : T;
                    if (Util.isNullOrNil(T) && !Util.isNullOrNil(this.f296909e.f284129U1)) {
                        T = this.f296909e.f284129U1;
                        C87412m.m108593f(T, "emojiInfo.meaning");
                    }
                    View findViewById2 = inflate.findViewById(C0966R.C0970id.f357915iy0);
                    C87412m.m108593f(findViewById2, "detailView.findViewById(…_half_dialog_detail_desc)");
                    this.f296913i = (TextView) findViewById2;
                    mo140841b(T);
                    View findViewById3 = inflate.findViewById(C0966R.C0970id.iy4);
                    C87412m.m108593f(findViewById3, "detailView.findViewById(…log_detail_relative_root)");
                    this.f296915n = findViewById3;
                    if (this.f296910f) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(4);
                        View view = findViewById3;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view2 = this.f296915n;
                        if (view2 != null) {
                            View findViewById4 = view2.findViewById(C0966R.C0970id.ml_);
                            C87412m.m108593f(findViewById4, "relativeInfoRoot.findVie…Id(R.id.relative_info_tv)");
                            this.f296914j = (TextView) findViewById4;
                        } else {
                            C87412m.m108603p("relativeInfoRoot");
                            throw null;
                        }
                    } else {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = findViewById3;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f296911g.mo140663j(inflate);
                    this.f296911g.mo140665l(new C101355e(this));
                }
                C86709a0.m107529k().f251779b.mo123455a(521, this);
                if (Util.isNullOrNil(this.f296909e.field_groupId)) {
                    Log.m105918d("MicroMsg.EmojiStoreV3SingleProductHalfDialog", "productId null, cancel get desc");
                } else {
                    C86709a0.m107529k().f251779b.mo123460f(new C33522n(this.f296909e.field_groupId));
                }
                if (!this.f296910f) {
                    return;
                }
                if (!Util.isNullOrNil(this.f296909e.field_groupId)) {
                    C86709a0.m107529k().f251779b.mo123455a(412, this);
                    this.f296918q = new C46441o(this.f296909e.field_groupId, 1, -1);
                    C86709a0.m107529k().f251779b.mo123460f(this.f296918q);
                } else if (!Util.isNullOrNil(this.f296909e.field_designerID)) {
                    C86709a0.m107529k().f251779b.mo123455a(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, this);
                    this.f296917p = new C33521l(this.f296909e.field_designerID);
                    C86709a0.m107529k().f251779b.mo123460f(this.f296917p);
                }
            } else {
                C87412m.m108603p("emojiView");
                throw null;
            }
        } else {
            C87412m.m108603p("emojiView");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo140840a() {
        String str;
        C101218e0 e0Var = this.f296911g;
        if (this.f296916o) {
            str = C76577a.m92166q(this.f296908d, C0966R.string.f7568jx);
            C87412m.m108593f(str, "getString(context, com.t…bmmui.R.string.app_added)");
        } else {
            str = C76577a.m92166q(this.f296908d, C0966R.string.c8e);
            C87412m.m108593f(str, "getString(context, com.t…ing.emoji_store_download)");
        }
        e0Var.mo140667n(str, this.f296908d.getResources().getString(C0966R.string.eup));
        if (this.f296916o) {
            this.f296911g.mo140666m(false, true);
            C101218e0 e0Var2 = this.f296911g;
            int d = C76577a.m92153d(this.f296908d, C0966R.color.f3257l0);
            Button button = e0Var2.f296396v;
            if (button != null) {
                button.setTextColor(d);
            }
            C101218e0 e0Var3 = this.f296911g;
            int d2 = C76577a.m92153d(this.f296908d, C0966R.color.f3543x9);
            Button button2 = e0Var3.f296397w;
            if (button2 != null) {
                button2.setTextColor(d2);
            }
        }
    }

    /* renamed from: b */
    public final void mo140841b(String str) {
        C87412m.m108594g(str, "newDesc");
        TextView textView = this.f296913i;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("descTv");
            throw null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C101824o80 o802;
        int i3 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 == null) {
            Log.m105924i(this.f296926y, "netScene null");
            return;
        }
        int type = yVar.getType();
        Log.m105924i(this.f296926y, "onSceneEnd: sceneType:" + type + ", errType:" + i + ", errCode:" + i3);
        if (type != 239) {
            String str2 = "";
            if (type != 412) {
                if (type == 521 && i3 == 0) {
                    String T = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(this.f296909e.getMd5());
                    if (T != null) {
                        str2 = T;
                    }
                    if (!Util.isNullOrNil(str2)) {
                        mo140841b(str2);
                    }
                }
            } else if (i3 == 0 && (yVar2 instanceof C46441o) && C87412m.m108589b(yVar2, this.f296918q)) {
                C101776f80 j1 = ((C46441o) yVar2).mo71837j1();
                if (j1 == null) {
                    o802 = null;
                } else {
                    o802 = new C101824o80();
                    o802.f299002o = j1.f298245q;
                    o802.f298995e = j1.f298236e;
                    o802.f298996f = j1.f298237f;
                    o802.f299001n = j1.f298242n;
                    o802.f298997g = j1.f298238g;
                    o802.f299003p = j1.f298246r;
                    o802.f299000j = j1.f298241j;
                    o802.f298999i = j1.f298240i;
                    o802.f299007t = j1.f298248t;
                    o802.f299008u = j1.f298249u;
                    o802.f298994d = j1.f298235d;
                    o802.f298991B = j1.f298233I;
                    o802.f298990A = j1.f298232H;
                }
                if (this.f296910f) {
                    if (o802 == null) {
                        Log.m105924i(this.f296926y, "updateEmotionRelativeInfo error, EmotionSummary error, md5:" + this.f296909e.getMd5());
                    } else if (Util.isNullOrNil(o802.f298996f)) {
                        Log.m105924i(this.f296926y, "updateEmotionRelativeInfo error, emotion pack name null, md5:" + this.f296909e.getMd5());
                        View view = this.f296915n;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(4);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        C87412m.m108603p("relativeInfoRoot");
                        throw null;
                    } else {
                        C101037a.m132405c(this.f296909e, 3, this.f296922u, this.f296923v, this.f296924w);
                        if (C87412m.m108589b(o802.f298994d, this.f296909e.field_groupId)) {
                            TextView textView = this.f296914j;
                            if (textView != null) {
                                textView.setText(o802.f298996f);
                                TextView textView2 = this.f296914j;
                                if (textView2 != null) {
                                    textView2.setOnClickListener(new C101357g(this, o802));
                                } else {
                                    C87412m.m108603p("relativeInfoTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("relativeInfoTv");
                                throw null;
                            }
                        }
                        View view3 = this.f296915n;
                        if (view3 != null) {
                            TextView textView3 = (TextView) view3.findViewById(C0966R.C0970id.mla);
                            if (textView3 != null) {
                                textView3.setText(C76577a.m92166q(this.f296908d, C0966R.string.fn8));
                            }
                            String str3 = o802.f298995e;
                            View view4 = this.f296915n;
                            if (view4 != null) {
                                ImageView imageView = (ImageView) view4.findViewById(C0966R.C0970id.ml9);
                                if (!Util.isNullOrNil(str3)) {
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    if (C101963g.m134217b(o802.f298994d)) {
                                        C20828a.m22825b().mo32518g(str2, imageView);
                                        if (imageView != null) {
                                            imageView.setImageResource(C0966R.C0969drawable.icon_002_cover);
                                        }
                                    } else {
                                        C20828a b = C20828a.m22825b();
                                        String str4 = o802.f298995e;
                                        b.mo32519h(str4, imageView, C98601f.m128139d(o802.f298994d, str4));
                                    }
                                } else if (imageView != null) {
                                    imageView.setVisibility(8);
                                }
                                View view5 = this.f296915n;
                                if (view5 != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view6 = view5;
                                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    return;
                                }
                                C87412m.m108603p("relativeInfoRoot");
                                throw null;
                            }
                            C87412m.m108603p("relativeInfoRoot");
                            throw null;
                        }
                        C87412m.m108603p("relativeInfoRoot");
                        throw null;
                    }
                }
            }
        } else if (i3 == 0 && (yVar2 instanceof C33521l) && C87412m.m108589b(yVar2, this.f296917p)) {
            C52325zy1 j15 = ((C33521l) yVar2).mo59185j1();
            C49978jd3 jd32 = j15 != null ? j15.f146279d : null;
            if (this.f296910f) {
                if (jd32 == null) {
                    Log.m105924i(this.f296926y, "updateDesignerRelativeInfo error, PersonalDesigner error, md5:" + this.f296909e.getMd5());
                    return;
                }
                String str5 = jd32.f136020e;
                if (Util.isNullOrNil(str5)) {
                    Log.m105924i(this.f296926y, "updateDesignerRelativeInfo error, designerName null, md5:" + this.f296909e.getMd5());
                    View view7 = this.f296915n;
                    if (view7 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(4);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    C87412m.m108603p("relativeInfoRoot");
                    throw null;
                }
                C101037a.m132405c(this.f296909e, 3, this.f296922u, this.f296923v, this.f296924w);
                TextView textView4 = this.f296914j;
                if (textView4 != null) {
                    textView4.setText(str5);
                    TextView textView5 = this.f296914j;
                    if (textView5 != null) {
                        textView5.setOnClickListener(new C101356f(this, jd32));
                        View view9 = this.f296915n;
                        if (view9 != null) {
                            TextView textView6 = (TextView) view9.findViewById(C0966R.C0970id.mla);
                            if (textView6 != null) {
                                textView6.setText(C76577a.m92166q(this.f296908d, C0966R.string.fn7));
                            }
                            View view10 = this.f296915n;
                            if (view10 != null) {
                                ImageView imageView2 = (ImageView) view10.findViewById(C0966R.C0970id.ml9);
                                String str6 = jd32.f136021f;
                                if (!Util.isNullOrNil(str6)) {
                                    if (imageView2 != null) {
                                        imageView2.setVisibility(0);
                                    }
                                    C20828a.m22825b().mo32519h(str6, imageView2, C98601f.m128137b(this.f296909e.field_groupId, str6));
                                    View view11 = this.f296915n;
                                    if (view11 != null) {
                                        C9556a aVar4 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                        aVar4.mo10233c(0);
                                        View view12 = view11;
                                        C117292a.m165358d(view12, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view11.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                        C117292a.m165359e(view12, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        return;
                                    }
                                    C87412m.m108603p("relativeInfoRoot");
                                    throw null;
                                } else if (imageView2 != null) {
                                    imageView2.setVisibility(8);
                                }
                            } else {
                                C87412m.m108603p("relativeInfoRoot");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("relativeInfoRoot");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("relativeInfoTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("relativeInfoTv");
                    throw null;
                }
            }
        }
    }
}
