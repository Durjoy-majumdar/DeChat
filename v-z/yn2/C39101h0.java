package yn2;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.sns.p106ui.album.SnsAlbumUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import jr2.C99015i;

@C86522b
/* renamed from: yn2.h0 */
public class C39101h0 extends C86301e implements C99015i {
    /* renamed from: P5 */
    public MMFragment mo61934P5(Context context, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("instantiateAlbumFragment", "com.tencent.mm.plugin.sns.PluginSns");
        MMFragment mMFragment = (MMFragment) Fragment.instantiate(context, SnsAlbumUI.class.getName(), bundle);
        SnsMethodCalculate.markEndTimeMs("instantiateAlbumFragment", "com.tencent.mm.plugin.sns.PluginSns");
        return mMFragment;
    }

    /* renamed from: YO */
    public String mo61935YO() {
        SnsMethodCalculate.markStartTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.PluginSns");
        String str = C86709a0.m107535s().f251806d + "sns" + "/";
        SnsMethodCalculate.markEndTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.PluginSns");
        return str;
    }

    /* renamed from: iU */
    public String mo61936iU() {
        SnsMethodCalculate.markStartTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.PluginSns");
        String str = C86709a0.m107535s().f251806d + "sns" + "/" + "temp" + "/";
        SnsMethodCalculate.markEndTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.PluginSns");
        return str;
    }

    public String t10() {
        SnsMethodCalculate.markStartTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.PluginSns");
        String str = C86709a0.m107535s().f251806d + "sns" + "/" + "sns_ad/" + "/";
        SnsMethodCalculate.markEndTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.PluginSns");
        return str;
    }
}
