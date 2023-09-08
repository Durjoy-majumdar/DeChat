package com.tencent.p014mm.plugin.voip.p475ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import fy3.C32227p;
import gy3.C24565l;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import nj3.C76912y0;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/voip/ui/RepairerVoipFaceBeautyUI$paramsAdapter$2$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$paramsAdapter$2$1 */
public final class RepairerVoipFaceBeautyUI$paramsAdapter$2$1 implements C9500j {
    public final /* synthetic */ RepairerVoipFaceBeautyUI this$0;

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$paramsAdapter$2$1$a */
    public /* synthetic */ class C106415a extends C24565l implements C32227p<Integer, Integer, C13598b0> {
        public C106415a(Object obj) {
            super(2, obj, RepairerVoipFaceBeautyUI.class, "onValueChanged", "onValueChanged(II)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI = (RepairerVoipFaceBeautyUI) this.receiver;
            repairerVoipFaceBeautyUI.getClass();
            if (intValue == -1 || intValue2 > 100 || intValue2 < 0) {
                C76912y0.m92767f(repairerVoipFaceBeautyUI, "设置" + repairerVoipFaceBeautyUI.mo152904H7().get(intValue).f82269d + '=' + intValue2 + "失败");
            } else {
                C76912y0.m92768g(repairerVoipFaceBeautyUI, "设置" + repairerVoipFaceBeautyUI.mo152904H7().get(intValue).f82269d + '=' + intValue2 + "成功");
                InputMethodManager inputMethodManager = (InputMethodManager) repairerVoipFaceBeautyUI.getSystemService("input_method");
                boolean z = true;
                if (inputMethodManager == null || !inputMethodManager.isActive()) {
                    z = false;
                }
                if (z) {
                    View currentFocus = repairerVoipFaceBeautyUI.getCurrentFocus();
                    inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
                }
                repairerVoipFaceBeautyUI.mo152904H7().get(intValue).f82270e = intValue2;
            }
            return C13598b0.f38549a;
        }
    }

    public RepairerVoipFaceBeautyUI$paramsAdapter$2$1(RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI) {
        this.this$0 = repairerVoipFaceBeautyUI;
    }

    public C60896i<?> getItemConvert(int i) {
        return new C106442d(new C106415a(this.this$0));
    }
}
