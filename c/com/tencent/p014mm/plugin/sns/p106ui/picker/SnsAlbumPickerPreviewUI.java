package com.tencent.p014mm.plugin.sns.p106ui.picker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsBaseGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.xweb.file.XVFSFile;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101804kv2;
import yu2.C102953l;
import yu2.C102954m;
import yu2.C102955n;
import yu2.C102956o;
import yu2.C102957p;
import yu2.C53585k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI */
public final class SnsAlbumPickerPreviewUI extends SnsBaseGalleryUI {

    /* renamed from: R0 */
    public static final /* synthetic */ int f280747R0 = 0;

    /* renamed from: P */
    public final C13601g f280748P = C36568h.m40985a(new C43140g(this));

    /* renamed from: Q */
    public final C13601g f280749Q = C36568h.m40985a(new C43141h(this));

    /* renamed from: Q0 */
    public int f280750Q0 = -1;

    /* renamed from: R */
    public final C13601g f280751R = C36568h.m40985a(new C43136c(this));

    /* renamed from: S */
    public final C13601g f280752S = C36568h.m40985a(new C43134a(this));

    /* renamed from: T */
    public final C13601g f280753T = C36568h.m40985a(new C43139f(this));

    /* renamed from: U */
    public final C13601g f280754U = C36568h.m40985a(new C43135b(this));

    /* renamed from: V */
    public final C13601g f280755V = C36568h.m40985a(new C43138e(this));

    /* renamed from: W */
    public final C13601g f280756W = C36568h.m40985a(C43142i.f116714d);

    /* renamed from: X */
    public int f280757X;

    /* renamed from: Y */
    public String f280758Y = "";

    /* renamed from: Z */
    public int f280759Z;

    /* renamed from: p0 */
    public String f280760p0 = "";

    /* renamed from: x0 */
    public boolean f280761x0;

    /* renamed from: y0 */
    public String f280762y0 = "--/--";

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$a */
    public static final class C43134a extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43134a(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116706d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mActionBarLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mActionBarLayout$2");
            RelativeLayout relativeLayout = (RelativeLayout) this.f116706d.findViewById(C0966R.C0970id.f5458fo);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mActionBarLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mActionBarLayout$2");
            return relativeLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$b */
    public static final class C43135b extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43135b(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116707d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBackBtn$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBackBtn$2");
            LinearLayout linearLayout = (LinearLayout) this.f116707d.findViewById(C0966R.C0970id.f5470g0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBackBtn$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBackBtn$2");
            return linearLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$c */
    public static final class C43136c extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43136c(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116708d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBottomBar$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBottomBar$2");
            RelativeLayout relativeLayout = (RelativeLayout) this.f116708d.findViewById(C0966R.C0970id.ai7);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBottomBar$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mBottomBar$2");
            return relativeLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$d */
    public static final class C43137d extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43137d(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116709d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mLayoutContent$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mLayoutContent$2");
            LinearLayout linearLayout = (LinearLayout) this.f116709d.findViewById(C0966R.C0970id.fkg);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mLayoutContent$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mLayoutContent$2");
            return linearLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$e */
    public static final class C43138e extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43138e(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116710d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mNextButton$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mNextButton$2");
            Button button = (Button) this.f116710d.findViewById(C0966R.C0970id.f5420en);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mNextButton$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mNextButton$2");
            return button;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$f */
    public static final class C43139f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43139f(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116711d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mPageTitleTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mPageTitleTv$2");
            TextView textView = (TextView) this.f116711d.findViewById(C0966R.C0970id.f5435f2);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mPageTitleTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mPageTitleTv$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$g */
    public static final class C43140g extends C87413o implements C32224a<ImageButton> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43140g(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116712d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
            ImageButton imageButton = (ImageButton) this.f116712d.findViewById(C0966R.C0970id.b_s);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
            return imageButton;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$h */
    public static final class C43141h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerPreviewUI f116713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43141h(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
            super(0);
            this.f116713d = snsAlbumPickerPreviewUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectTv$2");
            TextView textView = (TextView) this.f116713d.findViewById(C0966R.C0970id.hw6);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectTv$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$i */
    public static final class C43142i extends C87413o implements C32224a<ArrayList<String>> {

        /* renamed from: d */
        public static final C43142i f116714d = new C43142i();

        public C43142i() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectedMediaObjIdList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectedMediaObjIdList$2");
            ArrayList arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectedMediaObjIdList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectedMediaObjIdList$2");
            return arrayList;
        }
    }

    public SnsAlbumPickerPreviewUI() {
        C36568h.m40985a(new C43137d(this));
    }

    /* renamed from: c8 */
    public static final /* synthetic */ ArrayList m123157c8(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        SnsMethodCalculate.markStartTimeMs("access$getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        ArrayList<String> i8 = snsAlbumPickerPreviewUI.mo133688i8();
        SnsMethodCalculate.markEndTimeMs("access$getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return i8;
    }

    /* renamed from: d8 */
    public final void mo133684d8(String str, List<String> list) {
        SnsMethodCalculate.markStartTimeMs("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        C87412m.m108594g(str, "mediaObjId");
        C87412m.m108594g(list, "mediaObjIdList");
        SnsMethodCalculate.markStartTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        boolean contains = list.contains(str);
        SnsMethodCalculate.markEndTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (contains) {
            mo133690k8(false);
            mo133691l8(str, false, list);
            String j8 = mo133689j8(mo133688i8().size());
            SnsMethodCalculate.markStartTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            Button g8 = mo133687g8();
            if (g8 != null) {
                g8.setEnabled(true);
                g8.setText(j8);
            }
            SnsMethodCalculate.markEndTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        } else {
            mo133690k8(true);
            mo133691l8(str, true, list);
            String j84 = mo133689j8(mo133688i8().size());
            SnsMethodCalculate.markStartTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            Button g84 = mo133687g8();
            if (g84 != null) {
                g84.setEnabled(true);
                g84.setText(j84);
            }
            SnsMethodCalculate.markEndTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        }
        SnsMethodCalculate.markEndTimeMs("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    /* renamed from: e8 */
    public final RelativeLayout mo133685e8() {
        SnsMethodCalculate.markStartTimeMs("getMActionBarLayout", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        RelativeLayout relativeLayout = (RelativeLayout) ((C36570n) this.f280752S).getValue();
        SnsMethodCalculate.markEndTimeMs("getMActionBarLayout", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return relativeLayout;
    }

    /* renamed from: f8 */
    public final RelativeLayout mo133686f8() {
        SnsMethodCalculate.markStartTimeMs("getMBottomBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        RelativeLayout relativeLayout = (RelativeLayout) ((C36570n) this.f280751R).getValue();
        SnsMethodCalculate.markEndTimeMs("getMBottomBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return relativeLayout;
    }

    /* renamed from: g8 */
    public final Button mo133687g8() {
        SnsMethodCalculate.markStartTimeMs("getMNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        Button button = (Button) ((C36570n) this.f280755V).getValue();
        SnsMethodCalculate.markEndTimeMs("getMNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return button;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return C0966R.C0971layout.bnm;
    }

    /* renamed from: i8 */
    public final ArrayList<String> mo133688i8() {
        SnsMethodCalculate.markStartTimeMs("getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        ArrayList<String> arrayList = (ArrayList) ((C36570n) this.f280756W).getValue();
        SnsMethodCalculate.markEndTimeMs("getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return arrayList;
    }

    /* renamed from: j8 */
    public final String mo133689j8(int i) {
        SnsMethodCalculate.markStartTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (i > 0) {
            String str = getContext().getResources().getString(C0966R.string.f360089a13) + '(' + i + XVFSFile.SEPARATOR_CHAR + this.f280750Q0 + ')';
            SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            return str;
        }
        String string = getContext().getResources().getString(C0966R.string.f360089a13);
        C87412m.m108593f(string, "context.resources.getStr…ui.R.string.app_nextstep)");
        SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return string;
    }

    /* renamed from: k8 */
    public final void mo133690k8(boolean z) {
        int i;
        SnsMethodCalculate.markStartTimeMs("updateSelectButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (z) {
            SnsMethodCalculate.markStartTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            i = C0966R.raw.checkbox_selected_orange;
            SnsMethodCalculate.markEndTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        } else {
            SnsMethodCalculate.markStartTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            i = C0966R.raw.radio_off;
            SnsMethodCalculate.markEndTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        }
        SnsMethodCalculate.markStartTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        ImageButton imageButton = (ImageButton) ((C36570n) this.f280748P).getValue();
        SnsMethodCalculate.markEndTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (imageButton != null) {
            imageButton.setImageResource(i);
        }
        SnsMethodCalculate.markEndTimeMs("updateSelectButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    /* renamed from: l8 */
    public final void mo133691l8(String str, boolean z, List<String> list) {
        SnsMethodCalculate.markStartTimeMs("updateSelectData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        C87412m.m108594g(str, "mediaObjId");
        C87412m.m108594g(list, "mediaObjIdList");
        if (z) {
            if (!list.contains(str)) {
                list.add(str);
            } else if (list.remove(str)) {
                list.add(str);
            }
        } else if (list.contains(str)) {
            list.remove(str);
        }
        SnsMethodCalculate.markEndTimeMs("updateSelectData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    /* renamed from: o2 */
    public void mo132031o2(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (this.f277761o != null) {
            if (!Util.isNullOrNil(str) && i != 3) {
                this.f277761o.mo132770E(str);
            }
            if (z) {
                this.f277761o.mo132768C(true);
            } else {
                this.f277761o.mo132796y();
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onCreate(bundle);
        C85875k4.m106195m0(this);
        hideTitleView();
        getWindow().addFlags(128);
        SnsMethodCalculate.markStartTimeMs("handlerIntentData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        this.f280759Z = getIntent().getIntExtra("sns_video_scene", 0);
        String stringExtra = getIntent().getStringExtra("sns_gallery_userName");
        if (stringExtra == null) {
            stringExtra = C75592q0.m90789s();
            C87412m.m108593f(stringExtra, "getUsernameFromUserInfo()");
        }
        this.f280758Y = stringExtra;
        getIntent().getIntExtra("sns_gallery_localId", 0);
        getIntent().getBooleanExtra("sns_gallery_is_self", false);
        this.f280757X = getIntent().getIntExtra("sns_gallery_position", 0);
        this.f280750Q0 = getIntent().getIntExtra("sns_album_select_limit_count", 9);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("sns_album_select_mediaobj_id_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        mo133688i8().addAll(stringArrayListExtra);
        SnsMethodCalculate.markEndTimeMs("handlerIntentData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        enableOptionMenu(true);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        getWindow().clearFlags(128);
        C94866e1.Fx0().mo131089I(this);
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onResume();
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            C101804kv2 cntMedia = snsInfoFlip.getCntMedia();
            this.f277761o.mo132768C(cntMedia != null && cntMedia.f298690e == 6);
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onStart();
        SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("initFlipView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsInfoFlip snsInfoFlip = new SnsInfoFlip(this);
        snsInfoFlip.setVideoScene(this.f280759Z);
        snsInfoFlip.setNeedOCRImg(false);
        snsInfoFlip.setNeedScanImage(false);
        snsInfoFlip.setNeedTranslationImg(false);
        snsInfoFlip.setShowTitle(false);
        snsInfoFlip.setEnableHorLongBmpMode(false);
        snsInfoFlip.setUIFromScene(getIntent().getIntExtra("key_from_scene", 0));
        snsInfoFlip.setFromScene(new C96983o3("album_self"));
        snsInfoFlip.f278166k1 = this.f280758Y;
        this.f277761o = snsInfoFlip;
        C5431p1.C5432a dy02 = C94866e1.dy0();
        String str = this.f280758Y;
        dy02.getClass();
        SnsMethodCalculate.markStartTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ArrayList arrayList = (ArrayList) ((HashMap) dy02.f21145p).get(str);
        SnsMethodCalculate.markEndTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        if (this.f277753d) {
            this.f277761o.mo132797z(arrayList2, this.f280758Y, this.f280757X, mo132587P7(), this);
        } else {
            this.f277761o.mo132797z(arrayList2, this.f280758Y, this.f280757X, mo132586O7(), this);
        }
        this.f277761o.setOnPageSelectListener(this);
        addView(this.f277761o);
        C102953l lVar = new C102953l(this);
        SnsMethodCalculate.markStartTimeMs("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsInfoFlip snsInfoFlip2 = this.f277761o;
        if (snsInfoFlip2 == null) {
            SnsMethodCalculate.markEndTimeMs("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        } else {
            snsInfoFlip2.getGallery().setSingleClickOverListener(lVar);
            SnsMethodCalculate.markEndTimeMs("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
        C102954m mVar = new C102954m(this);
        SnsMethodCalculate.markStartTimeMs("setGalleryPageChangeListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277743D = mVar;
        SnsMethodCalculate.markEndTimeMs("setGalleryPageChangeListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("initFlipView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("initSelectArea", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("getMSelectTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        TextView textView = (TextView) ((C36570n) this.f280749Q).getValue();
        SnsMethodCalculate.markEndTimeMs("getMSelectTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (textView != null) {
            textView.setOnClickListener(new C102956o(this));
        }
        SnsMethodCalculate.markStartTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        ImageButton imageButton = (ImageButton) ((C36570n) this.f280748P).getValue();
        SnsMethodCalculate.markEndTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (imageButton != null) {
            imageButton.setOnClickListener(new C102957p(this));
        }
        SnsMethodCalculate.markEndTimeMs("initSelectArea", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        setActionbarColor(getResources().getColor(C0966R.color.f3496v_));
        SnsMethodCalculate.markStartTimeMs("initNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        Button g8 = mo133687g8();
        if (g8 != null) {
            g8.setText(mo133689j8(mo133688i8().size()));
            g8.setContentDescription(mo133687g8().getText());
            g8.setOnClickListener(new C102955n(this));
        }
        SnsMethodCalculate.markEndTimeMs("initNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("initBackButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("getMBackBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        LinearLayout linearLayout = (LinearLayout) ((C36570n) this.f280754U).getValue();
        SnsMethodCalculate.markEndTimeMs("getMBackBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C53585k(this));
        }
        SnsMethodCalculate.markEndTimeMs("initBackButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onStop();
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    /* renamed from: p7 */
    public void mo132178p7(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markStartTimeMs("getMPageTitleTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        TextView textView = (TextView) ((C36570n) this.f280753T).getValue();
        SnsMethodCalculate.markEndTimeMs("getMPageTitleTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (textView != null) {
            SnsMethodCalculate.markStartTimeMs("getCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            String str3 = this.f280762y0;
            SnsMethodCalculate.markEndTimeMs("getCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            textView.setText(str3);
        }
        SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }
}
