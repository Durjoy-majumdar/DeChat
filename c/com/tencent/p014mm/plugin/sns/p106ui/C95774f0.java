package com.tencent.p014mm.plugin.sns.p106ui;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f14.C58901s;
import fy3.C32227p;
import g34.C116918i;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kg3.C76577a;
import kotlin.ResultKt;
import kr2.C76634a;
import ks2.C10405e;
import nj3.C76879j;
import p159gw.C8462g;
import rx3.C13598b0;
import te3.C101802kr2;
import te3.f94;
import vr2.C102236a0;
import vr2.C102270y;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.sns.ui.f0 */
public final class C95774f0 extends C96157q {

    /* renamed from: c */
    public MMActivity f279400c;

    /* renamed from: d */
    public String f279401d;

    /* renamed from: e */
    public String f279402e;

    /* renamed from: f */
    public String f279403f;

    /* renamed from: g */
    public String f279404g;

    /* renamed from: h */
    public String f279405h;

    /* renamed from: i */
    public String f279406i;

    /* renamed from: j */
    public int f279407j = 1;

    /* renamed from: k */
    public int f279408k;

    /* renamed from: l */
    public boolean f279409l;

    /* renamed from: m */
    public WXMediaMessage f279410m;

    /* renamed from: n */
    public final HashMap<String, Bitmap> f279411n = new HashMap<>();

    /* renamed from: o */
    public C53973z1 f279412o;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1", mo125469f = "ExceprtWidget.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.f0$a */
    public static final class C95775a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f279413d;

        /* renamed from: e */
        public final /* synthetic */ C95774f0 f279414e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f279415f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1", mo125469f = "ExceprtWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ui.f0$a$a */
        public static final class C95776a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C95774f0 f279416d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C95776a(C95774f0 f0Var, C15601d<? super C95776a> dVar) {
                super(2, dVar);
                this.f279416d = f0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                C95776a aVar = new C95776a(this.f279416d, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                Object invokeSuspend = ((C95776a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                ResultKt.throwOnFailure(obj);
                String l = C95774f0.m122622l(this.f279416d);
                if (l != null) {
                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(l);
                    int i = imageOptions.outWidth;
                    int i2 = imageOptions.outHeight;
                    int a = C79406f.m96347a(C95774f0.m122621k(this.f279416d), (float) C76577a.m92155f(C95774f0.m122621k(this.f279416d), C0966R.dimen.aou));
                    double d = (((double) a) * 1.0d) / ((double) i);
                    float b = C79406f.m96348b(C95774f0.m122621k(this.f279416d), (float) i2);
                    double d2 = ((double) b) * d;
                    if (d2 < ((double) i2)) {
                        b = (float) d2;
                    }
                    String l2 = C95774f0.m122622l(this.f279416d);
                    if (l2 != null) {
                        Bitmap extractThumbNail = BitmapUtil.extractThumbNail(l2, a, (int) b, false);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
                        return extractThumbNail;
                    }
                    C87412m.m108603p("path");
                    throw null;
                }
                C87412m.m108603p("path");
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95775a(C95774f0 f0Var, ImageView imageView, C15601d<? super C95775a> dVar) {
            super(2, dVar);
            this.f279414e = f0Var;
            this.f279415f = imageView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            C95775a aVar = new C95775a(this.f279414e, this.f279415f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            Object invokeSuspend = ((C95775a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f279413d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C95776a aVar2 = new C95776a(this.f279414e, (C15601d<? super C95776a>) null);
                this.f279413d = 1;
                obj = C53895h.m60469g(h0Var, aVar2, this);
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                throw illegalStateException;
            }
            C87412m.m108593f(obj, "@OptIn(DelicateCoroutine…        return view\n    }");
            Bitmap bitmap = (Bitmap) obj;
            C95774f0 f0Var = this.f279414e;
            SnsMethodCalculate.markStartTimeMs("access$getBitmapContainer$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
            HashMap<String, Bitmap> hashMap = f0Var.f279411n;
            SnsMethodCalculate.markEndTimeMs("access$getBitmapContainer$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
            String l = C95774f0.m122622l(this.f279414e);
            if (l != null) {
                hashMap.put(l, bitmap);
                if (C102236a0.m134740e(bitmap)) {
                    ImageView imageView = this.f279415f;
                    if ((imageView != null ? imageView.getTag() : null) != null && (this.f279415f.getTag() instanceof String)) {
                        Object tag = this.f279415f.getTag();
                        String l2 = C95774f0.m122622l(this.f279414e);
                        if (l2 == null) {
                            C87412m.m108603p("path");
                            throw null;
                        } else if (C87412m.m108589b(tag, l2)) {
                            this.f279415f.setImageBitmap(bitmap);
                        }
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                return b0Var;
            }
            C87412m.m108603p("path");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.f0$b */
    public static final class C95777b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C95774f0 f279417d;

        public C95777b(C95774f0 f0Var) {
            this.f279417d = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ExceprtWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$2");
            ArrayList arrayList2 = new ArrayList();
            String l = C95774f0.m122622l(this.f279417d);
            if (l != null) {
                arrayList2.add(l);
                Intent intent = new Intent();
                intent.setClass(C95774f0.m122621k(this.f279417d), SnsUploadBrowseUI.class);
                intent.putExtra("sns_gallery_position", 0);
                intent.putExtra("sns_gallery_temp_paths", arrayList2);
                intent.putExtra("key_from_scene", 7);
                intent.putExtra("k_need_delete", C95774f0.m122621k(this.f279417d).getIntent().getBooleanExtra("k_need_delete", true));
                C95774f0.m122621k(this.f279417d).startActivityForResult(intent, 7);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ExceprtWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("path");
            throw null;
        }
    }

    public C95774f0(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        this.f279400c = mMActivity;
    }

    /* renamed from: k */
    public static final /* synthetic */ MMActivity m122621k(C95774f0 f0Var) {
        SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        MMActivity mMActivity = f0Var.f279400c;
        SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return mMActivity;
    }

    /* renamed from: l */
    public static final /* synthetic */ String m122622l(C95774f0 f0Var) {
        SnsMethodCalculate.markStartTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        String str = f0Var.f279401d;
        SnsMethodCalculate.markEndTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return str;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        View inflate = LayoutInflater.from(this.f279400c).inflate(C0966R.C0971layout.d_v, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.fc8);
        imageView.setBackground((Drawable) null);
        imageView.setPadding(0, 0, 0, 0);
        String str = this.f279401d;
        if (str != null) {
            imageView.setTag(str);
            HashMap<String, Bitmap> hashMap = this.f279411n;
            String str2 = this.f279401d;
            if (str2 != null) {
                Bitmap bitmap = hashMap.get(str2);
                if (!C102236a0.m134740e(bitmap)) {
                    C0001s1 s1Var = C0001s1.f0d;
                    C53896h0 h0Var = C53872d1.f151117a;
                    this.f279412o = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C95775a(this, imageView, (C15601d<? super C95775a>) null), 2, (Object) null);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
                inflate.setOnClickListener(new C95777b(this));
                SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
                return inflate;
            }
            C87412m.m108603p("path");
            throw null;
        }
        C87412m.m108603p("path");
        throw null;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        String str = this.f279401d;
        if (str != null) {
            SnsMethodCalculate.markStartTimeMs("checkMediaFile", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
            boolean z = false;
            if (!Util.isNullOrNil(str) && C86013q1.m106450k(str)) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("checkMediaFile", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
            if (!z) {
                C76879j.m92738i(this.f279400c, C0966R.string.jjx, C0966R.string.a3h);
            }
            SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
            return z;
        }
        C87412m.m108603p("path");
        throw null;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        this.f279401d = String.valueOf(this.f279400c.getIntent().getStringExtra("sns_kemdia_path"));
        this.f279402e = String.valueOf(this.f279400c.getIntent().getStringExtra("sns_exceprt_url"));
        String nullAs = Util.nullAs(this.f279400c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        C87412m.m108593f(nullAs, "nullAs(context.intent.ge…dUI.KSnsUploadAppid), \"\")");
        this.f279403f = nullAs;
        String nullAs2 = Util.nullAs(this.f279400c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        C87412m.m108593f(nullAs2, "nullAs(context.intent.ge…I.KSnsUploadAppname), \"\")");
        this.f279404g = nullAs2;
        this.f279409l = this.f279400c.getIntent().getBooleanExtra("KSnsAction", false);
        this.f279408k = this.f279400c.getIntent().getIntExtra("Ksnsupload_source", 0);
        String nullAs3 = Util.nullAs(this.f279400c.getIntent().getStringExtra("reportSessionId"), "");
        C87412m.m108593f(nullAs3, "nullAs(context.intent.ge…K_REPORT_SESSION_ID), \"\")");
        this.f279405h = nullAs3;
        Bundle bundleExtra = this.f279400c.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f279410m = new SendMessageToWX.Req(bundleExtra).message;
        }
        this.f279407j = this.f279400c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true) ? 1 : 0;
        String nullAs4 = Util.nullAs(this.f279400c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        C87412m.m108593f(nullAs4, "nullAs(context.intent.ge…ageWrapper.KPkgName), \"\")");
        this.f279406i = nullAs4;
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        WXMediaMessage wXMediaMessage;
        List<String> gt;
        int i6 = i;
        int i7 = i2;
        C116918i iVar2 = iVar;
        String str3 = str;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        C94945s2 s2Var = new C94945s2(1, this.f279400c);
        LinkedList linkedList2 = new LinkedList();
        String str4 = this.f279401d;
        if (str4 != null) {
            C102270y yVar = new C102270y(str4, 2);
            yVar.f301218e = 2;
            yVar.f301217d = i6;
            yVar.f301216c = i7;
            if (iVar2 != null) {
                yVar.f301223j = iVar2.f350347d;
                yVar.f301224k = iVar2.f350348e;
            }
            yVar.f301225l = str3;
            yVar.f301227n = false;
            linkedList2.add(yVar);
            if (iVar2 != null) {
                s2Var.mo131241O(iVar2.f350347d, iVar2.f350348e);
            }
            if (i3 > C76634a.f224255a) {
                s2Var.mo131261r(1, 3);
            }
            LinkedList linkedList3 = new LinkedList();
            if (!(list == null || (gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt()) == null)) {
                for (String next : list) {
                    if (!gt.contains(next)) {
                        f94 f94 = new f94();
                        f94.f298255d = next;
                        linkedList3.add(f94);
                    }
                }
            }
            s2Var.mo131260q(str3);
            s2Var.mo131262s(linkedList);
            s2Var.mo131265v(kr22);
            s2Var.mo131243Q(linkedList3);
            s2Var.mo131228B(i6);
            s2Var.mo131239M(i7);
            if (z) {
                s2Var.mo131264u(1);
            } else {
                s2Var.mo131264u(0);
            }
            String str5 = this.f279403f;
            if (str5 != null) {
                if (!Util.isNullOrNil(str5)) {
                    String str6 = this.f279403f;
                    if (str6 != null) {
                        s2Var.mo131231E(str6);
                    } else {
                        C87412m.m108603p("appId");
                        throw null;
                    }
                }
                String str7 = this.f279404g;
                if (str7 != null) {
                    if (!Util.isNullOrNil(str7)) {
                        String str8 = this.f279404g;
                        if (str8 != null) {
                            s2Var.mo131230D(Util.nullAs(str8, ""));
                        } else {
                            C87412m.m108603p("appName");
                            throw null;
                        }
                    }
                    s2Var.mo131234H(this.f279408k);
                    if (this.f279409l && (wXMediaMessage = this.f279410m) != null) {
                        s2Var.mo131238L(wXMediaMessage != null ? wXMediaMessage.mediaTagName : null);
                    }
                    s2Var.mo131235I((String) null, (String) null, (String) null, i4, i5);
                    int i8 = this.f279407j;
                    String str9 = this.f279406i;
                    if (str9 != null) {
                        s2Var.mo131269z(i8, str9);
                        s2Var.mo131263t(list2);
                        String str10 = this.f279405h;
                        if (str10 != null) {
                            s2Var.mo131232F(str10);
                            String str11 = this.f279402e;
                            if (str11 != null) {
                                SnsMethodCalculate.markStartTimeMs("addPicExcerptUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                                Log.m105924i("MicroMsg.UploadPackHelper", "[addPicExcerptUrl] url = " + str11);
                                if (!Util.isNullOrNil(str11)) {
                                    TimeLineObject timeLineObject = s2Var.f275199f;
                                    timeLineObject.snsExcerptUrl = str11;
                                    timeLineObject.isExcerpt = true;
                                }
                                SnsMethodCalculate.markEndTimeMs("addPicExcerptUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                                s2Var.mo131242P(linkedList2);
                                int i9 = s2Var.mo131252i();
                                Intent intent = new Intent();
                                C10405e.C10406a.f31628a.f31627a = i9;
                                intent.putExtra("sns_local_id", i9);
                                this.f279400c.setResult(-1, intent);
                                this.f279400c.finish();
                                C94866e1.gy0().mo131192c();
                                SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
                                return true;
                            }
                            C87412m.m108603p("excerptUrl");
                            throw null;
                        }
                        C87412m.m108603p("sessionId");
                        throw null;
                    }
                    C87412m.m108603p("sdkPackageName");
                    throw null;
                }
                C87412m.m108603p("appName");
                throw null;
            }
            C87412m.m108603p("appId");
            throw null;
        }
        C87412m.m108603p("path");
        throw null;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        C53973z1 z1Var = this.f279412o;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        for (String str : this.f279411n.keySet()) {
            Bitmap bitmap = this.f279411n.get(str);
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f279411n.clear();
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }
}
