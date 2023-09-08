package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C54020j;
import ad0.C91999u;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.model.C94958v;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import rx3.C13598b0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.k0 */
public final class C95994k0 extends C95754d2 {

    /* renamed from: B */
    public C54020j f280319B;

    /* renamed from: C */
    public String f280320C = "";

    /* renamed from: com.tencent.mm.plugin.sns.ui.k0$a */
    public static final class C95995a extends C94958v<String, Integer, Boolean> {

        /* renamed from: c */
        public final ImageView f280321c;

        /* renamed from: d */
        public final String f280322d;

        /* renamed from: e */
        public Bitmap f280323e;

        public C95995a(ImageView imageView, String str) {
            C87412m.m108594g(imageView, "iv");
            C87412m.m108594g(str, "path");
            this.f280321c = imageView;
            this.f280322d = str;
        }

        /* renamed from: a */
        public Object mo131151a(Object[] objArr) {
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            C87412m.m108594g((String[]) objArr, "params");
            this.f280323e = BitmapUtil.extractThumbNail(this.f280322d, C94866e1.Hx0(), C94866e1.Hx0(), true);
            int orientationInDegree = Exif.fromFile(this.f280322d).getOrientationInDegree();
            Log.m105919d("MicroMsg.MMAsyncTask", "exifPath : %s degree : %d", this.f280322d, Integer.valueOf(orientationInDegree));
            this.f280323e = BitmapUtil.rotate(this.f280323e, (float) orientationInDegree);
            Boolean bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            return bool;
        }

        /* renamed from: b */
        public ExecutorService mo131152b() {
            SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            ExecutorService Gx0 = C94866e1.Gx0();
            C87412m.m108593f(Gx0, "getMediaExecutor()");
            SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            return Gx0;
        }

        /* renamed from: c */
        public void mo131153c(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            super.mo131153c(Boolean.valueOf(booleanValue));
            if (C102236a0.m134740e(this.f280323e)) {
                this.f280321c.setImageBitmap(this.f280323e);
            }
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.k0$b */
    public static final class C95996b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C95994k0 f280324d;

        public C95996b(C95994k0 k0Var) {
            this.f280324d = k0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/FinderPicWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$initView$1$1");
            Intent intent = new Intent();
            intent.setClass(this.f280324d.f279311d, SnsUploadBrowseUI.class);
            intent.putExtra("k_need_delete", false);
            intent.putExtra("sns_gallery_position", 0);
            intent.putExtra("key_from_scene", 7);
            ArrayList arrayList2 = new ArrayList();
            C95994k0 k0Var = this.f280324d;
            SnsMethodCalculate.markStartTimeMs("access$getMediaPath$p", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
            String str = k0Var.f280320C;
            SnsMethodCalculate.markEndTimeMs("access$getMediaPath$p", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
            arrayList2.add(str);
            C13598b0 b0Var = C13598b0.f38549a;
            intent.putExtra("sns_gallery_temp_paths", arrayList2);
            this.f280324d.f279311d.startActivityForResult(intent, 7);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$initView$1$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/FinderPicWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95994k0(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        View inflate = C85868k2.m106137b(this.f279311d).inflate(C0966R.C0971layout.c2y, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.jt7);
        C54020j jVar = this.f280319B;
        if (!(jVar == null || jVar.mo74686c() == null)) {
            int[] b = C95198o2.m121130b(this.f279311d);
            Object obj = C91999u.m115565k(b[0], b[1], this.f279311d, false).first;
            Integer num = (Integer) obj;
            C87412m.m108593f(num, "smallSide");
            inflate.setLayoutParams(new ViewGroup.LayoutParams(num.intValue(), (int) ((((Number) obj).floatValue() * 3.5f) / 3.0f)));
            inflate.requestLayout();
            C87412m.m108593f(imageView, "thumb");
            new C95995a(imageView, this.f280320C).mo131292d("");
            imageView.setOnClickListener(new C95996b(this));
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        return inflate;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        super.mo132126d(bundle);
        String stringExtra = this.f279311d.getIntent().getStringExtra("sns_kemdia_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f280320C = stringExtra;
        String stringExtra2 = this.f279311d.getIntent().getStringExtra("ksnsupload_finder_live_xml");
        if (!Util.isNullOrNil(stringExtra2) && (parseXml = XmlParser.parseXml(stringExtra2, "finderLive", (String) null)) != null) {
            C54020j jVar = new C54020j();
            jVar.mo74688e("", parseXml);
            this.f280319B = jVar;
        }
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        return false;
    }

    /* renamed from: p */
    public void mo133200p(C94945s2 s2Var) {
        SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        C54020j jVar = this.f280319B;
        if (!(jVar == null || s2Var == null)) {
            s2Var.mo131233G(jVar);
        }
        super.mo133200p(s2Var);
        SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
    }
}
