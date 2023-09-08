package sk3;

import android.text.SpannableString;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import nk3.C61802h;
import nk3.C61805j;
import ok3.C62070e;
import p525fr.C59311b;

/* renamed from: sk3.b0 */
public final class C63970b0 extends C63994l0 implements C61805j {

    /* renamed from: r */
    public C59311b f181365r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63970b0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: M0 */
    public void mo86728M0(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("MicroMsg.FTSMultiItemFinderFeedUIC", "[onItemClick] position:%s", Integer.valueOf(i));
    }

    /* renamed from: R1 */
    public void mo86729R1(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("MicroMsg.FTSMultiItemFinderFeedUIC", "[onItemLongClick] position:%s", Integer.valueOf(i));
    }

    /* renamed from: c3 */
    public SpannableString mo88749c3() {
        return new SpannableString("");
    }

    /* renamed from: d3 */
    public C61802h mo88750d3() {
        return null;
    }
}
