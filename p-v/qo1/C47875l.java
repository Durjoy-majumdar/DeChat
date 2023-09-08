package qo1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C52271zj0;

/* renamed from: qo1.l */
public final class C47875l extends C87413o implements C32226l<C52271zj0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Intent f128474d;

    /* renamed from: e */
    public final /* synthetic */ Context f128475e;

    /* renamed from: f */
    public final /* synthetic */ int f128476f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47875l(Intent intent, Context context, int i) {
        super(1);
        this.f128474d = intent;
        this.f128475e = context;
        this.f128476f = i;
    }

    public Object invoke(Object obj) {
        C13598b0 b0Var;
        String str;
        String str2;
        String str3;
        C52271zj0 zj02 = (C52271zj0) obj;
        if (zj02 != null) {
            Intent intent = this.f128474d;
            Context context = this.f128475e;
            int i = this.f128476f;
            FinderContact finderContact = zj02.f146006e;
            intent.putExtra("key_topic_id", zj02.f146005d);
            intent.putExtra("key_activity_type", 101);
            String str4 = "";
            if (finderContact == null || (str = finderContact.username) == null) {
                str = str4;
            }
            intent.putExtra("key_user_name", str);
            if (finderContact == null || (str2 = finderContact.nickname) == null) {
                str2 = str4;
            }
            intent.putExtra("key_nick_name", str2);
            if (finderContact == null || (str3 = finderContact.headUrl) == null) {
                str3 = str4;
            }
            intent.putExtra("key_avatar_url", str3);
            String str5 = zj02.f146010i;
            if (str5 == null) {
                str5 = str4;
            }
            intent.putExtra("key_cover_url", str5);
            intent.putExtra("key_activity_display_mask", zj02.f146022x);
            String str6 = zj02.f146007f;
            if (str6 == null) {
                str6 = str4;
            }
            intent.putExtra("key_activity_name", str6);
            String str7 = zj02.f146008g;
            if (str7 != null) {
                str4 = str7;
            }
            intent.putExtra("key_activity_desc", str4);
            intent.putExtra("key_activity_end_time", zj02.f146018t);
            intent.putExtra("saveActivity", true);
            C63295m.f179622a.mo88204o(intent, context, i);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C63295m.f179622a.mo88204o(this.f128474d, this.f128475e, this.f128476f);
        }
        return C13598b0.f38549a;
    }
}
