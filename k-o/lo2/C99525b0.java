package lo2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import kg3.C76577a;
import ps2.C100891r;
import qs2.C101287r;

/* renamed from: lo2.b0 */
public class C99525b0 {

    /* renamed from: lo2.b0$a */
    public class C99526a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ Context f291765d;

        /* renamed from: e */
        public final /* synthetic */ C101287r f291766e;

        /* renamed from: f */
        public final /* synthetic */ Button f291767f;

        public C99526a(Context context, C101287r rVar, Button button) {
            this.f291765d = context;
            this.f291766e = rVar;
            this.f291767f = button;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$1");
            try {
                Log.m105924i("BtnIconUpdateHelper", "after onLayoutChange, then updateBtnIconLogic");
                Context context = this.f291765d;
                C101287r rVar = this.f291766e;
                Button button = this.f291767f;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                C99525b0.m129882e(context, rVar, button);
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                this.f291767f.removeOnLayoutChangeListener(this);
            } catch (Throwable th) {
                Log.m105920e("BtnIconUpdateHelper", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$1");
        }
    }

    /* renamed from: a */
    public static void m129878a(Context context, Button button, float f, C101287r rVar) {
        SnsMethodCalculate.markStartTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (button == null || rVar == null) {
            Log.m105920e("BtnIconUpdateHelper", "adjustFloatBarIconBtn, but btn or btnInfo is null");
            SnsMethodCalculate.markEndTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        float f2 = rVar.f296708T;
        if (f2 <= 0.0f) {
            f2 = (float) C76577a.m92151b(context, 20);
        }
        float b = f2 + ((float) C76577a.m92151b(context, 4));
        Log.m105924i("BtnIconUpdateHelper", "btn width = " + f);
        int measureText = ((int) (f - (b + button.getPaint().measureText(button.getText().toString())))) / 2;
        if (measureText < 0) {
            Log.m105918d("BtnIconUpdateHelper", "updateBtnIcon but horizontalPadding < 0");
            SnsMethodCalculate.markEndTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        Log.m105924i("BtnIconUpdateHelper", "horizontalPadding = " + measureText);
        button.setPadding(measureText, 0, measureText, 0);
        SnsMethodCalculate.markEndTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    /* renamed from: b */
    public static boolean m129879b(Context context, C101287r rVar, Button button) {
        SnsMethodCalculate.markStartTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (context == null || rVar == null || button == null) {
            Log.m105920e("BtnIconUpdateHelper", "context or btnInfo or btn is null ");
            SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        } else if (Util.isNullOrNil(rVar.f296707S)) {
            SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        } else if (Util.isNullOrNil(button.getText())) {
            Log.m105920e("BtnIconUpdateHelper", "btnText is null ");
            SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return true;
        }
    }

    /* renamed from: c */
    public static void m129880c(Context context, C101287r rVar, Button button, String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
        if (decodeFile == null) {
            Log.m105920e("BtnIconUpdateHelper", "onDownloaded, bitmap == null");
            SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeFile);
        float f = rVar.f296708T;
        if (f <= 0.0f) {
            f = (float) C76577a.m92151b(context, 20);
        }
        int b = C76577a.m92151b(context, 4);
        float measureText = ((float) b) + f + button.getPaint().measureText(button.getText().toString());
        float width = (float) button.getWidth();
        Log.m105924i("BtnIconUpdateHelper", "btn width = " + width);
        int i = ((int) (width - measureText)) / 2;
        if (i < 0) {
            Log.m105918d("BtnIconUpdateHelper", "updateBtnIcon but horizontalPadding < 0");
            SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        Log.m105924i("BtnIconUpdateHelper", "horizontalPadding = " + i);
        button.setPadding(i, 0, i, 0);
        button.setIncludeFontPadding(false);
        bitmapDrawable.setTint(Color.parseColor(rVar.f296691C));
        int i2 = (int) f;
        bitmapDrawable.setBounds(0, 0, i2, i2);
        button.setCompoundDrawables(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        button.setCompoundDrawablePadding(b);
        SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    /* renamed from: d */
    public static void m129881d(Context context, C101287r rVar, Button button) {
        SnsMethodCalculate.markStartTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        try {
            if (!m129879b(context, rVar, button)) {
                SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            } else if (button.getWidth() > 0) {
                Log.m105924i("BtnIconUpdateHelper", "already onLayoutChange, then updateBtnIconLogic");
                m129882e(context, rVar, button);
                SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            } else {
                button.addOnLayoutChangeListener(new C99526a(context, rVar, button));
                SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            }
        } catch (Throwable th) {
            Log.m105920e("BtnIconUpdateHelper", th.toString());
        }
    }

    /* renamed from: e */
    public static void m129882e(Context context, C101287r rVar, Button button) {
        SnsMethodCalculate.markStartTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        String l = C100891r.m132217l("adId", rVar.f296707S);
        if (Util.isNullOrNil(l) || !C86013q1.m106450k(l)) {
            SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            String str = rVar.f296707S;
            if (Util.isNullOrNil(str)) {
                SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            } else {
                Log.m105918d("BtnIconUpdateHelper", "loadImage, hash = " + button.hashCode() + ", btnIconUrl = " + str);
                button.setTag(C0966R.C0970id.joh, str);
                C100891r.m132207b("adId", str, false, 41, 0, new C61318c0(button, str, context, rVar));
                SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            }
            SnsMethodCalculate.markEndTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        Log.m105924i("BtnIconUpdateHelper", "icon exists, url = " + rVar.f296707S);
        m129880c(context, rVar, button, l);
        SnsMethodCalculate.markEndTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }
}
