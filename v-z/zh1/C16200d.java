package zh1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import cj1.C0639y1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C7578x;
import fh1.C59018f2;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import ke3.C88144b;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: zh1.d */
public final class C16200d extends C16198b {

    /* renamed from: f */
    public final C32226l<String, C13598b0> f43402f;

    /* renamed from: g */
    public C6606x f43403g;

    /* renamed from: zh1.d$a */
    public static final class C16201a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16200d f43404d;

        public C16201a(C16200d dVar) {
            this.f43404d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/gift/widget/GiftActivityJumpToastWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f43404d.mo14731c();
            C16200d dVar = this.f43404d;
            dVar.mo14734e(dVar.f43399e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftActivityJumpToastWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16200d(Context context, ViewGroup viewGroup, C32226l<? super String, C13598b0> lVar) {
        super(context, viewGroup);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "parentRoot");
        C87412m.m108594g(lVar, "rotateBlock");
        this.f43402f = lVar;
        this.f43397c.setOnClickListener(new C16201a(this));
    }

    /* renamed from: a */
    public int mo14729a() {
        return C0966R.C0971layout.d45;
    }

    /* renamed from: b */
    public int mo14730b() {
        return -C76577a.m92151b(this.f43395a, 4);
    }

    /* renamed from: d */
    public void mo14732d(ViewGroup viewGroup, String str) {
        C13598b0 b0Var;
        C87412m.m108594g(viewGroup, "attachView");
        C87412m.m108594g(str, "giftId");
        C8916d d = C0639y1.f1510a.mo612d(str);
        if (d == null || d.field_jumpInfo == null) {
            b0Var = null;
        } else {
            super.mo14732d(viewGroup, str);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            mo14731c();
            Log.m105920e("GiftActivityJumpToastWidget", "jumpInfo = null");
        }
    }

    /* renamed from: e */
    public final void mo14734e(String str) {
        FinderJumpInfo finderJumpInfo;
        String str2;
        String str3 = str;
        C87412m.m108594g(str3, "giftId");
        C8916d d = C0639y1.f1510a.mo612d(str3);
        C13598b0 b0Var = null;
        if (!(d == null || (finderJumpInfo = d.field_jumpInfo) == null)) {
            int i = 0;
            Log.m105925i("GiftActivityJumpToastWidget", "bannerJumpImpl business_type:%d", Integer.valueOf(finderJumpInfo.business_type));
            if (finderJumpInfo.jumpinfo_type == 2) {
                Html5Info html5Info = finderJumpInfo.html5_info;
                if (html5Info == null || (str2 = html5Info.url) == null) {
                    str2 = "";
                }
                Log.m105925i("GiftActivityJumpToastWidget", "jump half h5 url:%s", str2);
                if (finderJumpInfo.html5_info == null || TextUtils.isEmpty(str2)) {
                    Log.m105920e("GiftActivityJumpToastWidget", "jumpToHalfScreenH5 html5_info is null or url is empty");
                } else {
                    Html5Info html5Info2 = finderJumpInfo.html5_info;
                    if (!(html5Info2 != null && html5Info2.style == 1)) {
                        Log.m105924i("GiftActivityJumpToastWidget", "show FullScreenWebView");
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", str2);
                        intent.putExtra("convertActivityFromTranslucent", true);
                        C88144b.m109791i(this.f43395a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    } else if (this.f43395a.getResources().getConfiguration().orientation == 2) {
                        this.f43402f.invoke(this.f43399e);
                        Log.m105924i("GiftActivityJumpToastWidget", "change to portrait and show dialog");
                    } else {
                        Html5Info html5Info3 = finderJumpInfo.html5_info;
                        if (html5Info3 != null) {
                            i = html5Info3.height_percent;
                        }
                        Log.m105924i("GiftActivityJumpToastWidget", "show HalfScreenWebView heightPercent:" + i);
                        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                        if (i < 50 || i > 90) {
                            i = 75;
                        }
                        float f = ((float) i) / ((float) 100);
                        Log.m105924i("GiftActivityJumpToastWidget", "realScreenHeightPercent:" + f);
                        Context context = this.f43395a;
                        C44361u uVar = r6;
                        C44361u uVar2 = new C44361u(f, (String) null, false, false, 0, false, 0, false, false, 0, false, false, false, (String) null, false, 32756, (C8480h) null);
                        C6606x Ws = ((C7578x) C86312j.m106911c(C7578x.class)).mo8699Ws(context, str2, (MMWebView) null, uVar);
                        this.f43403g = Ws;
                        if (Ws != null) {
                            Ws.show();
                        }
                        C6606x xVar = this.f43403g;
                        if (xVar != null) {
                            xVar.setOnDismissListener(new C16202e(this));
                        }
                    }
                }
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("GiftActivityJumpToastWidget", "giftActivityJumpToastWidget jump click null");
        }
    }
}
