package er1;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7888v2;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46120y4;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ke3.C88144b;
import o40.C61926c;
import p166hy.C8830s0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11986o0;
import pl1.C11990s0;
import pl1.C62344b0;
import qo3.C77389a;
import qo3.C77398g;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64689rq2;
import up1.C27696y;
import z04.C112550d0;

/* renamed from: er1.s3 */
public final class C7868s3 implements C46120y4 {

    /* renamed from: a */
    public static final C7868s3 f26472a = new C7868s3();

    /* renamed from: er1.s3$a */
    public static final class C7869a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f26473d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f26474e;

        public C7869a(BaseFinderFeed baseFinderFeed, AppCompatActivity appCompatActivity) {
            this.f26473d = baseFinderFeed;
            this.f26474e = appCompatActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String p = C61926c.m72691p(!this.f26473d.mo3513o().isPostFinish() ? 0 : this.f26473d.mo3513o().getId());
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f26474e);
            objArr[0] = f != null ? f.f38098n : null;
            objArr[1] = p;
            objArr[2] = 1;
            objArr[3] = ((C8830s0) C86312j.m106911c(C8830s0.class)).mo9667ey();
            nVar.mo160131h(21180, objArr);
            C7888v2.C7889a.m8057w(C7888v2.f26513a, this.f26474e, this.f26473d, (Bundle) null, 5, this.f26474e.getIntent().getBooleanExtra("key_form_sns", false) ? 1 : this.f26474e.getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false) ? 2 : 0, 4, (Object) null);
        }
    }

    /* renamed from: er1.s3$b */
    public static final class C7870b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f26475d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f26476e;

        public C7870b(BaseFinderFeed baseFinderFeed, AppCompatActivity appCompatActivity) {
            this.f26475d = baseFinderFeed;
            this.f26476e = appCompatActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            String p = C61926c.m72691p(!this.f26475d.mo3513o().isPostFinish() ? 0 : this.f26475d.mo3513o().getId());
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f26476e);
            objArr[0] = f != null ? f.f38098n : null;
            objArr[1] = p;
            objArr[2] = 0;
            objArr[3] = ((C8830s0) C86312j.m106911c(C8830s0.class)).mo9667ey();
            nVar.mo160131h(21180, objArr);
        }
    }

    /* renamed from: er1.s3$c */
    public static final class C7871c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f26477d;

        /* renamed from: e */
        public final /* synthetic */ Context f26478e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7871c(String str, Context context) {
            super(1);
            this.f26477d = str;
            this.f26478e = context;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "url");
            String str2 = this.f26477d;
            Log.m105924i(str2, "click " + str);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(this.f26478e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo8974a(Object obj, ImageView imageView) {
        C64689rq2 rq22;
        C27696y yVar = C27696y.THUMB_IMAGE;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (obj != null && imageView != null && (obj instanceof FinderObject)) {
            FinderItem a = FinderItem.Companion.mo79056a((FinderObject) obj, 1);
            if (a.isLiveFeed()) {
                rq22 = (C64689rq2) C110818d0.m150916N(a.getLiveMediaList());
            } else {
                rq22 = (C64689rq2) C110818d0.m150916N(a.getMediaList());
            }
            C64689rq2 rq23 = rq22;
            if (rq23 != null) {
                int i = rq23.f185268f;
                if (i == 4) {
                    if (Util.isNullOrNil(rq23.f185283w)) {
                        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C62344b0(rq23, yVar, (String) null, (String) null, 12, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                        return;
                    }
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11986o0(rq23, yVar, (String) null, 4, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                } else if (i == 9) {
                    String str = Util.nullAsNil(rq23.f185283w) + Util.nullAsNil(rq23.f185234A);
                    if (Util.isNullOrNil(str)) {
                        str = rq23.f185267e + Util.nullAsNil(rq23.f185288z);
                    }
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                } else {
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C62344b0(rq23, yVar, (String) null, (String) null, 12, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8975b(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(baseFinderFeed, "feed");
        if (C58784w3.f168295a.mo83897Q0(baseFinderFeed) && baseFinderFeed.mo3469C()) {
            baseFinderFeed.mo3510m0(false);
            C77389a aVar = new C77389a();
            aVar.f225660q = C0086a.m38a(appCompatActivity).getString(C0966R.string.d_9);
            aVar.f225668y = false;
            aVar.f225669z = true;
            aVar.f225664u = C0086a.m38a(appCompatActivity).getString(C0966R.string.d__);
            aVar.f225663t = C0086a.m38a(appCompatActivity).getString(C0966R.string.d_a);
            aVar.f225620C = new C7869a(baseFinderFeed, appCompatActivity);
            aVar.f225622E = new C7870b(baseFinderFeed, appCompatActivity);
            C77398g gVar = new C77398g(appCompatActivity, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        }
    }

    /* renamed from: c */
    public final Point mo8976c(View view, View view2) {
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(view2, "parent");
        view.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new Point(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: d */
    public final int mo8978d(View view) {
        C87412m.m108594g(view, "<this>");
        int width = view.getWidth();
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        return (width > 0 || view2 == null) ? width : mo8976c(view, view2).x;
    }

    /* renamed from: e */
    public final void mo8979e(Context context, TextView textView, String str) {
        Context context2 = context;
        TextView textView2 = textView;
        String str2 = str;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(textView2, "descTv");
        C87412m.m108594g(str2, "logTag");
        String string = context2.getString(C0966R.string.d5k);
        C87412m.m108593f(string, "context.getString(R.stri…r_create_contact_warning)");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video", Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLanguage(context)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        arrayList.add(format);
        String format2 = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/readtemplate?t=finder_privacy", Arrays.copyOf(new Object[0], 0));
        C87412m.m108593f(format2, "format(format, *args)");
        arrayList.add(format2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(context2.getString(C0966R.string.d57));
        arrayList2.add(context2.getString(C0966R.string.d5h));
        SpannableString spannableString = new SpannableString(string);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = (String) next;
                int E = C112550d0.m153769E(string, str3, 0, false, 6, (Object) null);
                int length = str3.length() + E;
                if (E >= 0 && length <= string.length()) {
                    Object obj = arrayList.get(i);
                    C87412m.m108593f(obj, "h5urlList[index]");
                    spannableString.setSpan(new C4059g5((String) obj, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d), MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2), false, false, new C7871c(str2, context2), 24, (C8480h) null), E, length, 17);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        textView2.setText(spannableString);
        textView2.setOnTouchListener(new C75655v3(spannableString, textView2));
    }

    /* renamed from: c */
    public final RefreshLoadMoreLayout mo8977c(ViewGroup viewGroup) {
        RefreshLoadMoreLayout c;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            ViewGroup viewGroup2 = null;
            if (i >= childCount) {
                return null;
            }
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof RefreshLoadMoreLayout) {
                    return (RefreshLoadMoreLayout) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                }
                if (!(viewGroup2 == null || (c = f26472a.mo8977c(viewGroup2)) == null)) {
                    return c;
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    public void mo8973a(ViewGroup viewGroup) {
        RefreshLoadMoreLayout c;
        if (viewGroup != null && (c = mo8977c(viewGroup)) != null) {
            RecyclerView.C16613e adapter = c.getRecyclerView().getAdapter();
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null && wxRecyclerAdapter.getItemCount() > 0) {
                wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getItemCount(), new C13604l(30, 1));
            }
        }
    }
}
