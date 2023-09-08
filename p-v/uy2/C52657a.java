package uy2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import di3.C86312j;
import gy3.C87412m;
import p629ny.C76979h;
import rz2.C48212k;
import wz2.C53271b;
import xy2.C53477h;

/* renamed from: uy2.a */
public final class C52657a extends C53271b {

    /* renamed from: T0 */
    public static final IAutoDBItem.MAutoDBInfo f147039T0 = C53271b.initAutoDBInfo(C52657a.class);

    /* renamed from: Q0 */
    public CharSequence f147040Q0;

    /* renamed from: R0 */
    public String f147041R0;

    /* renamed from: S0 */
    public String f147042S0;

    public boolean equals(Object obj) {
        return (obj instanceof C52657a) && ((C52657a) obj).systemRowid == this.systemRowid;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f147039T0;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public int hashCode() {
        return (int) this.systemRowid;
    }

    /* renamed from: l2 */
    public final void mo73602l2() {
        if (C87412m.m108589b(this.field_sessionId, "textstatussayhisessionholder")) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.f361454k11);
            this.f147041R0 = string;
            this.f147040Q0 = string;
            return;
        }
        C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(this.field_sessionId);
        this.f147041R0 = wx02 != null ? wx02.field_nickname : null;
        this.f147040Q0 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), this.f147041R0);
    }
}
