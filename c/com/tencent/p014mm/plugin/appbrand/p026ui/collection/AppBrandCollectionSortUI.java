package com.tencent.p014mm.plugin.appbrand.p026ui.collection;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import f40.C86737h0;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionSortUI */
public final class AppBrandCollectionSortUI extends MMActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f108924d = 0;

    public void finish() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2329q);
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
        }
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2329q);
    }

    public int getLayoutId() {
        return -1;
    }

    public void initActivityCloseAnimation() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = null;
        ArrayList parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("KEY_SORT_DATA_LIST") : null;
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            super.finish();
            return;
        }
        overridePendingTransition(C0966R.C0968anim.f2328p, C0966R.C0968anim.f2333y);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        getContentView().setBackgroundColor(getActionbarColor());
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        int i = AppBrandCollectionVerticalSortList.f246645j;
        Intent intent2 = getIntent();
        int i2 = 0;
        if (intent2 != null) {
            i2 = intent2.getIntExtra("KEY_OPERATE_REPORT_SCENE", 0);
        }
        Intent intent3 = getIntent();
        if (intent3 != null) {
            str = intent3.getStringExtra("KEY_OPERATE_REPORT_SCENE_ID");
        }
        AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList = new AppBrandCollectionVerticalSortList();
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelableArrayList("KEY_SORT_DATA_LIST", parcelableArrayListExtra);
        bundle2.putInt("KEY_OPERATE_REPORT_SCENE", i2);
        bundle2.putString("KEY_OPERATE_REPORT_SCENE_ID", str);
        appBrandCollectionVerticalSortList.setArguments(bundle2);
        beginTransaction.mo165200l(16908290, appBrandCollectionVerticalSortList);
        beginTransaction.mo165162d();
    }

    public void onResume() {
        super.onResume();
        setMMTitle((int) C0966R.string.f7839tb);
        hideActionbarLine();
    }
}
