package com.tencent.p014mm.plugin.sns.cover.edit;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverPostStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f72.C97842b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import nj3.C88989a;
import p151er.C31670u;
import p185kq.C10383h;
import pr2.C100843b;
import tr2.C101917a;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI */
public final class SnsCoverFinderPreviewUI extends MMActivity {

    /* renamed from: d */
    public AbsSnsBackPreview f274615d;

    /* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$a */
    public static final class C43027a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsCoverFinderPreviewUI f116474d;

        public C43027a(SnsCoverFinderPreviewUI snsCoverFinderPreviewUI) {
            this.f116474d = snsCoverFinderPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$1");
            this.f116474d.finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$b */
    public static final class C94800b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsCoverFinderPreviewUI f274616d;

        /* renamed from: e */
        public final /* synthetic */ FinderObject f274617e;

        /* renamed from: f */
        public final /* synthetic */ int f274618f;

        /* renamed from: g */
        public final /* synthetic */ int f274619g;

        public C94800b(SnsCoverFinderPreviewUI snsCoverFinderPreviewUI, FinderObject finderObject, int i, int i2) {
            this.f274616d = snsCoverFinderPreviewUI;
            this.f274617e = finderObject;
            this.f274618f = i;
            this.f274619g = i2;
        }

        public final void onClick(View view) {
            Class cls = C10383h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$2");
            SnsCoverFinderPreviewUI snsCoverFinderPreviewUI = this.f274616d;
            snsCoverFinderPreviewUI.setResult(-1, snsCoverFinderPreviewUI.getIntent());
            SnsCoverPostStruct D = SnsReportHelper.f275506m0.mo131343D();
            D.f265986g = D.mo86045b("FinderFeedID", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(this.f274617e.f164794id), true);
            SnsReportHelper.f275506m0.mo131343D().f265984e = this.f274618f;
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            int i = this.f274619g;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsCoverPostSelectTabType", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (i == 1) {
                snsReportHelper.f275530X.f265983d = 7;
            } else if (i == 2) {
                snsReportHelper.f275530X.f265983d = 6;
            } else if (i == 3) {
                snsReportHelper.f275530X.f265983d = 4;
            } else if (i == 4) {
                snsReportHelper.f275530X.f265983d = 5;
            } else if (i == 5) {
                snsReportHelper.f275530X.f265983d = 3;
            }
            SnsMethodCalculate.markEndTimeMs("setSnsCoverPostSelectTabType", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            SnsCoverActionStruct C = SnsReportHelper.f275506m0.mo131342C();
            C.f265982h = C.mo86045b("FinderFeedID", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(this.f274617e.f164794id), true);
            SnsReportHelper.f275506m0.mo131342C().f265979e = this.f274618f;
            this.f274616d.finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        return C0966R.C0971layout.f7105yf;
    }

    public void onCreate(Bundle bundle) {
        LinkedList<FinderMedia> linkedList;
        FinderMedia first;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        boolean z = true;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("setWindowStyle", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        C97842b.f286991a = true;
        getWindow().setFormat(-3);
        SnsMethodCalculate.markEndTimeMs("setWindowStyle", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SELECT_OBJECT");
        int intExtra = getIntent().getIntExtra("SELECT_TAB_TYPE", 0);
        if (byteArrayExtra == null) {
            Log.m105920e("MicroMsg.SnsCoverFinderPreviewUI", "finderObj bytes == null");
            finish();
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
            return;
        }
        FinderObject finderObject = new FinderObject();
        finderObject.parseFrom(byteArrayExtra);
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        int i = 4;
        if (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (first = linkedList.getFirst()) == null || first.mediaType != 4) {
            z = false;
        }
        if (z) {
            i = 3;
        }
        this.f274615d = C101917a.f300080a.mo141418a(this, i);
        ((ViewGroup) findViewById(C0966R.C0970id.e4i)).addView(this.f274615d, 0);
        AbsSnsBackPreview absSnsBackPreview = this.f274615d;
        C100843b bVar = absSnsBackPreview instanceof C100843b ? (C100843b) absSnsBackPreview : null;
        if (bVar != null) {
            bVar.loadFinderObject(finderObject);
        }
        findViewById(C0966R.C0970id.buz).setOnClickListener(new C43027a(this));
        View findViewById = findViewById(C0966R.C0970id.f357804bv0);
        findViewById.setOnClickListener(new C94800b(this, finderObject, i, intExtra));
        ((C31670u) C86312j.m106911c(C31670u.class)).mo58294JE(this, findViewById, finderObject);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onDestroy();
        AbsSnsBackPreview absSnsBackPreview = this.f274615d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onDestroy();
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onPause();
        AbsSnsBackPreview absSnsBackPreview = this.f274615d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPause();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onResume();
        AbsSnsBackPreview absSnsBackPreview = this.f274615d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onResume();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }
}
