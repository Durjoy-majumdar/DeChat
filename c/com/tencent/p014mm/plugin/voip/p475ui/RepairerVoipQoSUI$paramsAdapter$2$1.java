package com.tencent.p014mm.plugin.voip.p475ui;

import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/voip/ui/RepairerVoipQoSUI$paramsAdapter$2$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$paramsAdapter$2$1 */
public final class RepairerVoipQoSUI$paramsAdapter$2$1 implements C9500j {
    public final /* synthetic */ RepairerVoipQoSUI this$0;

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$paramsAdapter$2$1$a */
    public /* synthetic */ class C71586a extends C24565l implements C32227p<Integer, C30540n, C13598b0> {
        public C71586a(Object obj) {
            super(2, obj, RepairerVoipQoSUI.class, "onClickDelete", "onClickDelete(ILcom/tencent/mm/plugin/voip/ui/QosParams;)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C30540n nVar = (C30540n) obj2;
            C87412m.m108594g(nVar, "p1");
            RepairerVoipQoSUI repairerVoipQoSUI = (RepairerVoipQoSUI) this.receiver;
            repairerVoipQoSUI.getClass();
            if (intValue != -1) {
                repairerVoipQoSUI.mo98755H7().remove(nVar);
                ((WxRecyclerAdapter) ((C36570n) repairerVoipQoSUI.f207469h).getValue()).notifyItemRemoved(intValue);
            }
            return C13598b0.f38549a;
        }
    }

    public RepairerVoipQoSUI$paramsAdapter$2$1(RepairerVoipQoSUI repairerVoipQoSUI) {
        this.this$0 = repairerVoipQoSUI;
    }

    public C60896i<?> getItemConvert(int i) {
        return new C57475p(new C71586a(this.this$0));
    }
}
