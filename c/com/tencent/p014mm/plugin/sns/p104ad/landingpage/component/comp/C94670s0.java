package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kg3.C76577a;
import org.json.JSONObject;
import rq2.C101419f;
import so2.C101689s;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0 */
public class C94670s0 extends C95295z {

    /* renamed from: A */
    public FrameLayout f273947A;

    /* renamed from: B */
    public LinearLayout f273948B;

    /* renamed from: C */
    public TextView f273949C;

    /* renamed from: D */
    public int f273950D = 1;

    /* renamed from: E */
    public Bitmap f273951E;

    /* renamed from: F */
    public ViewOutlineProvider f273952F = new C94673b(this);

    /* renamed from: G */
    public Map<String, ImageView> f273953G = new HashMap();

    /* renamed from: H */
    public boolean f273954H = true;

    /* renamed from: I */
    public Handler f273955I = new C94676d();

    /* renamed from: s */
    public TextView f273956s;

    /* renamed from: t */
    public TextView f273957t;

    /* renamed from: u */
    public TextView f273958u;

    /* renamed from: v */
    public TextView f273959v;

    /* renamed from: w */
    public ImageView f273960w;

    /* renamed from: x */
    public ImageView f273961x;

    /* renamed from: y */
    public ImageView f273962y;

    /* renamed from: z */
    public TextView f273963z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0$a */
    public class C94671a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101689s f273964d;

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0$a$a */
        public class C94672a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f273966d;

            public C94672a(ArrayList arrayList) {
                this.f273966d = arrayList;
            }

            public void run() {
                String str;
                String str2;
                FrameLayout.LayoutParams layoutParams;
                String str3 = "run";
                String str4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1$1";
                SnsMethodCalculate.markStartTimeMs(str3, str4);
                C94671a aVar = C94671a.this;
                C94670s0 s0Var = C94670s0.this;
                int i = 4;
                int i2 = 1;
                if (s0Var.f273950D == 1) {
                    s0Var.f273949C.setText(aVar.f273964d.f297708L);
                    C94671a aVar2 = C94671a.this;
                    C101419f.m133083f(aVar2.f273964d.f297701E, C94670s0.this.f273960w);
                    C94671a aVar3 = C94671a.this;
                    C94670s0 s0Var2 = C94670s0.this;
                    C101689s sVar = aVar3.f273964d;
                    String str5 = sVar.f297704H;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    s0Var2.getClass();
                    SnsMethodCalculate.markStartTimeMs("addStrangerAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    s0Var2.f273947A.removeAllViews();
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(str5)) {
                        arrayList.add(str5);
                    }
                    ArrayList<String> arrayList2 = sVar.f297706J;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        arrayList.addAll(sVar.f297706J);
                    }
                    Log.m105924i("AdLandingSocialCardComponent", "addStrangerAvatar, count=" + arrayList.size());
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < arrayList.size()) {
                        SnsMethodCalculate.markStartTimeMs("getStrangerAvatarLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                        if (i3 == 0) {
                            int b = C76577a.m92151b(s0Var2.f276579d, 36);
                            layoutParams = new FrameLayout.LayoutParams(b, b);
                            layoutParams.gravity = 83;
                            layoutParams.leftMargin = C76577a.m92151b(s0Var2.f276579d, 56);
                            layoutParams.bottomMargin = C76577a.m92151b(s0Var2.f276579d, 9);
                        } else if (i3 == i2) {
                            int b2 = C76577a.m92151b(s0Var2.f276579d, 20);
                            layoutParams = new FrameLayout.LayoutParams(b2, b2);
                            layoutParams.gravity = 83;
                            layoutParams.leftMargin = C76577a.m92151b(s0Var2.f276579d, 22);
                            layoutParams.bottomMargin = C76577a.m92151b(s0Var2.f276579d, 67);
                        } else if (i3 == 2) {
                            int b3 = C76577a.m92151b(s0Var2.f276579d, 32);
                            layoutParams = new FrameLayout.LayoutParams(b3, b3);
                            layoutParams.gravity = 51;
                            layoutParams.leftMargin = C76577a.m92151b(s0Var2.f276579d, 42);
                            layoutParams.topMargin = C76577a.m92151b(s0Var2.f276579d, 20);
                        } else if (i3 == 3) {
                            int b4 = C76577a.m92151b(s0Var2.f276579d, 20);
                            layoutParams = new FrameLayout.LayoutParams(b4, b4);
                            layoutParams.gravity = 53;
                            layoutParams.rightMargin = C76577a.m92151b(s0Var2.f276579d, 77);
                            layoutParams.topMargin = C76577a.m92151b(s0Var2.f276579d, 17);
                        } else if (i3 == i) {
                            int b5 = C76577a.m92151b(s0Var2.f276579d, 34);
                            layoutParams = new FrameLayout.LayoutParams(b5, b5);
                            layoutParams.gravity = 53;
                            layoutParams.rightMargin = C76577a.m92151b(s0Var2.f276579d, 4);
                            layoutParams.topMargin = C76577a.m92151b(s0Var2.f276579d, 28);
                        } else if (i3 != 5) {
                            layoutParams = null;
                        } else {
                            int b6 = C76577a.m92151b(s0Var2.f276579d, 32);
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b6, b6);
                            layoutParams2.gravity = 85;
                            layoutParams2.rightMargin = C76577a.m92151b(s0Var2.f276579d, 33);
                            layoutParams2.bottomMargin = C76577a.m92151b(s0Var2.f276579d, 14);
                            layoutParams = layoutParams2;
                        }
                        SnsMethodCalculate.markEndTimeMs("getStrangerAvatarLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                        if (layoutParams != null) {
                            ImageView imageView = new ImageView(s0Var2.f276579d);
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            imageView.setImageBitmap(s0Var2.f273951E);
                            imageView.setOutlineProvider(s0Var2.f273952F);
                            imageView.setClipToOutline(true);
                            s0Var2.f273947A.addView(imageView, layoutParams);
                            SnsMethodCalculate.markStartTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                            C101419f.m133084g((String) arrayList.get(i3), imageView, 1.0f);
                            SnsMethodCalculate.markEndTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                            i4++;
                            if (i4 >= 6) {
                                break;
                            }
                        }
                        i3++;
                        i = 4;
                        i2 = 1;
                    }
                    SnsMethodCalculate.markEndTimeMs("addStrangerAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    C94670s0.this.f273947A.setVisibility(0);
                    C94670s0.this.f273948B.setVisibility(8);
                } else {
                    String str6 = aVar.f273964d.f297707K;
                    Log.m105924i("AdLandingSocialCardComponent", "desc raw=" + str6);
                    if (str6 != null && str6.contains("_FRIENDS_COUNT_")) {
                        str6 = str6.replace("_FRIENDS_COUNT_", String.valueOf(this.f273966d.size()));
                    }
                    Log.m105924i("AdLandingSocialCardComponent", "desc after=" + str6);
                    C94670s0.this.f273949C.setText(str6);
                    C94671a aVar4 = C94671a.this;
                    C101419f.m133083f(aVar4.f273964d.f297700D, C94670s0.this.f273960w);
                    C94671a aVar5 = C94671a.this;
                    C94670s0 s0Var3 = C94670s0.this;
                    String str7 = aVar5.f273964d.f297704H;
                    ArrayList arrayList3 = this.f273966d;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    s0Var3.getClass();
                    SnsMethodCalculate.markStartTimeMs("addFriendAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    s0Var3.f273948B.removeAllViews();
                    int b7 = C76577a.m92151b(s0Var3.f276579d, 32);
                    int b8 = C76577a.m92151b(s0Var3.f276579d, 8);
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        Iterator it = arrayList3.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Iterator it4 = it;
                            String str8 = (String) it.next();
                            str2 = str3;
                            str = str4;
                            ImageView imageView2 = new ImageView(s0Var3.f276579d);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            imageView2.setOutlineProvider(s0Var3.f273952F);
                            imageView2.setClipToOutline(true);
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(b7, b7);
                            if (i5 != 0) {
                                layoutParams3.leftMargin = b8;
                            }
                            s0Var3.f273948B.addView(imageView2, layoutParams3);
                            s0Var3.mo130259G(str8, imageView2);
                            i5++;
                            if (i5 >= 4) {
                                Log.m105924i("AdLandingSocialCardComponent", "break, total=" + arrayList3.size());
                                break;
                            }
                            str3 = str2;
                            it = it4;
                            str4 = str;
                        }
                    }
                    str2 = str3;
                    str = str4;
                    if (!TextUtils.isEmpty(str7)) {
                        ImageView imageView3 = new ImageView(s0Var3.f276579d);
                        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageView3.setImageBitmap(s0Var3.f273951E);
                        imageView3.setOutlineProvider(s0Var3.f273952F);
                        imageView3.setClipToOutline(true);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(b7, b7);
                        layoutParams4.leftMargin = b8;
                        s0Var3.f273948B.addView(imageView3, layoutParams4);
                        SnsMethodCalculate.markStartTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                        C101419f.m133084g(str7, imageView3, 1.0f);
                        SnsMethodCalculate.markEndTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    }
                    SnsMethodCalculate.markEndTimeMs("addFriendAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    C94670s0.this.f273947A.setVisibility(8);
                    C94670s0.this.f273948B.setVisibility(0);
                    C94670s0 s0Var4 = C94670s0.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    Handler handler = s0Var4.f273955I;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    handler.sendEmptyMessageDelayed(1, 2500);
                    str3 = str2;
                    str4 = str;
                }
                SnsMethodCalculate.markEndTimeMs(str3, str4);
            }
        }

        public C94671a(C101689s sVar) {
            this.f273964d = sVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1");
            C94670s0 s0Var = C94670s0.this;
            ArrayList<String> arrayList = this.f273964d.f297705I;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            s0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("checkFriends", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String isFriend = AdLandingPagesProxy.getInstance().isFriend(next);
                Log.m105924i("AdLandingSocialCardComponent", "checkFriends, hashUserName=" + next + ", realUserName=" + isFriend);
                if (!TextUtils.isEmpty(isFriend)) {
                    arrayList2.add(isFriend);
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkFriends", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            if (!arrayList2.isEmpty()) {
                C94670s0.this.f273950D = 0;
            } else {
                Log.m105928w("AdLandingSocialCardComponent", "friends is empty");
            }
            Log.m105924i("AdLandingSocialCardComponent", "uiType=" + C94670s0.this.f273950D);
            ((C119157j) C119157j.f356862d).mo183895z(new C94672a(arrayList2));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0$b */
    public class C94673b extends ViewOutlineProvider {
        public C94673b(C94670s0 s0Var) {
        }

        public void getOutline(View view, Outline outline) {
            SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$2");
            try {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0$c */
    public class C94674c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f273968d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f273969e;

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0$c$a */
        public class C94675a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f273971d;

            public C94675a(Bitmap bitmap) {
                this.f273971d = bitmap;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3$1");
                Bitmap bitmap = this.f273971d;
                if (bitmap == null || bitmap.isRecycled()) {
                    C94670s0 s0Var = C94670s0.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    boolean z = s0Var.f273954H;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    if (z) {
                        C94670s0 s0Var2 = C94670s0.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                        Map<String, ImageView> map = s0Var2.f273953G;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                        C94674c cVar = C94674c.this;
                        ((HashMap) map).put(cVar.f273968d, cVar.f273969e);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadAvatarByUserName end, userName=");
                    sb.append(C94674c.this.f273968d);
                    sb.append(", bmp=null, isNeedRetry=");
                    C94670s0 s0Var3 = C94670s0.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    boolean z2 = s0Var3.f273954H;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    sb.append(z2);
                    Log.m105928w("AdLandingSocialCardComponent", sb.toString());
                } else {
                    C94674c.this.f273969e.setImageBitmap(this.f273971d);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(C94674c.this.f273969e, "alpha", new float[]{0.5f, 1.0f});
                    ofFloat.setDuration(200);
                    ofFloat.start();
                    Log.m105924i("AdLandingSocialCardComponent", "loadAvatarByUserName end, userName=" + C94674c.this.f273968d + ", w=" + this.f273971d.getWidth() + ", h=" + this.f273971d.getHeight());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3$1");
            }
        }

        public C94674c(String str, ImageView imageView) {
            this.f273968d = str;
            this.f273969e = imageView;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3");
            Bitmap avatarByUserName = AdLandingPagesProxy.getInstance().getAvatarByUserName(this.f273968d, false);
            ((C119157j) C119157j.f356862d).mo183895z(new C94675a(avatarByUserName));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0$d */
    public class C94676d extends Handler {
        public C94676d() {
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$4");
            C94670s0 s0Var = C94670s0.this;
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            s0Var.f273954H = false;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            try {
                C94670s0 s0Var2 = C94670s0.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                Map<String, ImageView> map = s0Var2.f273953G;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                if (!((HashMap) map).isEmpty()) {
                    C94670s0 s0Var3 = C94670s0.this;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    Map<String, ImageView> map2 = s0Var3.f273953G;
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    for (Map.Entry entry : ((HashMap) map2).entrySet()) {
                        C94670s0 s0Var4 = C94670s0.this;
                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                        s0Var4.mo130259G((String) entry.getKey(), (ImageView) entry.getValue());
                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingSocialCardComponent", "handleMessage, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$4");
        }
    }

    public C94670s0(Context context, C101689s sVar, ViewGroup viewGroup) {
        super(context, sVar, viewGroup);
        Log.m105924i("AdLandingSocialCardComponent", "hash=" + hashCode() + ", info=" + sVar.toString());
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        super.mo124361D();
        this.f273955I.removeCallbacksAndMessages((Object) null);
        Log.m105918d("AdLandingSocialCardComponent", "viewWillDisappear");
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    /* renamed from: E */
    public final C101689s mo130258E() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        C101689s sVar = (C101689s) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        return sVar;
    }

    /* renamed from: G */
    public final void mo130259G(String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        Log.m105924i("AdLandingSocialCardComponent", "loadAvatarByUserName start, userName=" + str);
        imageView.setImageBitmap(this.f273951E);
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        imageView.setTag(str);
        ((C119157j) C119157j.f356862d).mo183875f(new C94674c(str, imageView));
        SnsMethodCalculate.markEndTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    /* renamed from: H */
    public void mo130260H() {
        SnsMethodCalculate.markStartTimeMs("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        Log.m105924i("AdLandingSocialCardComponent", "updateDyncContent");
        C101689s E = mo130258E();
        if (E == null) {
            SnsMethodCalculate.markEndTimeMs("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        this.f273956s.setText(E.f297709z);
        this.f273957t.setText(E.f297697A);
        this.f273958u.setText(E.f297698B);
        this.f273959v.setText(E.f297699C);
        this.f273963z.setText(E.f297703G);
        this.f273950D = 1;
        ((C119157j) C119157j.f356862d).mo183875f(new C94671a(E));
        SnsMethodCalculate.markEndTimeMs("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        this.f273956s = (TextView) this.f276586n.findViewById(C0966R.C0970id.kp9);
        this.f273957t = (TextView) this.f276586n.findViewById(C0966R.C0970id.kp5);
        this.f273958u = (TextView) this.f276586n.findViewById(C0966R.C0970id.kpf);
        this.f273959v = (TextView) this.f276586n.findViewById(C0966R.C0970id.f357845c22);
        this.f273960w = (ImageView) this.f276586n.findViewById(C0966R.C0970id.a8a);
        this.f273961x = (ImageView) this.f276586n.findViewById(C0966R.C0970id.a2c);
        ImageView imageView = (ImageView) this.f276586n.findViewById(C0966R.C0970id.jae);
        this.f273962y = imageView;
        imageView.setOutlineProvider(this.f273952F);
        this.f273962y.setClipToOutline(true);
        this.f273963z = (TextView) this.f276586n.findViewById(C0966R.C0970id.f357478a21);
        this.f273947A = (FrameLayout) this.f276586n.findViewById(C0966R.C0970id.k94);
        this.f273948B = (LinearLayout) this.f276586n.findViewById(C0966R.C0970id.ef6);
        this.f273949C = (TextView) this.f276586n.findViewById(C0966R.C0970id.agm);
        SnsMethodCalculate.markStartTimeMs("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        try {
            Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            this.f273951E = BitmapUtil.getRoundedCornerBitmap(decodeStream, false, (float) decodeStream.getWidth());
        } catch (Throwable th) {
            Log.m105920e("AdLandingSocialCardComponent", "initDefaultAvatar exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (this.f276586n == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        C101689s E = mo130258E();
        if (E == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        C101419f.m133083f(E.f297702F, this.f273961x);
        String selfUserName = AdLandingPagesProxy.getInstance().getSelfUserName();
        Log.m105924i("AdLandingSocialCardComponent", "fillItem, selfUserName=" + selfUserName);
        mo130259G(selfUserName, this.f273962y);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        return C0966R.C0971layout.c1i;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return false;
        }
        try {
            jSONObject.put("uiType", this.f273950D);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return true;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return false;
        }
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) mo130258E().f296499e, (int) mo130258E().f296497c, (int) mo130258E().f296500f, (int) mo130258E().f296498d);
            this.f276586n.setLayoutParams(marginLayoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }
}
