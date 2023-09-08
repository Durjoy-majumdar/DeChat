package er1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import ep1.C58659a;
import ep1.C58661c;
import ep1.C58664e;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: er1.a1 */
public final class C58679a1 {

    /* renamed from: a */
    public static final C58679a1 f167972a = new C58679a1();

    /* renamed from: er1.a1$a */
    public static final class C58680a implements C58664e {
        /* renamed from: a */
        public void mo83535a(Context context) {
            C87412m.m108594g(context, "context");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            if (f != null) {
                f.f38111y = "";
            }
            Log.m105924i("FinderJumpDataUtils", "[onClear] jumpInfo");
        }
    }

    /* renamed from: a */
    public final void mo83554a(Context context, Intent intent, int i, int i2) {
        Context context2 = context;
        Intent intent2 = intent;
        int i3 = i;
        int i4 = i2;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(intent2, "intent");
        if (context2 instanceof MMFragmentActivity) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context2);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            int i5 = q3 != null ? q3.f134675i : 0;
            C58661c cVar = C58661c.f167935f;
            C58661c cVar2 = C58661c.f167935f;
            MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) context2;
            C58680a aVar = new C58680a();
            cVar2.getClass();
            Integer num = cVar2.f167937b.get(Integer.valueOf(mMFragmentActivity.hashCode()));
            Integer num2 = 0;
            if (num == null) {
                num = num2;
            }
            if (num.intValue() > 0) {
                String simpleName = mMFragmentActivity.getClass().getSimpleName();
                int hashCode = mMFragmentActivity.hashCode();
                cVar2.f167939d.put(Integer.valueOf(hashCode), aVar);
                Integer num3 = cVar2.f167937b.get(Integer.valueOf(hashCode));
                if (num3 != null) {
                    num2 = num3;
                }
                int intValue = num2.intValue();
                C58659a aVar2 = cVar2.f167938c.get(Integer.valueOf(intValue));
                if (aVar2 == null) {
                    aVar2 = new C58659a();
                    cVar2.f167938c.put(Integer.valueOf(intValue), aVar2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append('-');
                sb.append(i4);
                sb.append('-');
                sb.append(i3);
                sb.append('-');
                sb.append(System.currentTimeMillis());
                String sb4 = sb.toString();
                if (aVar2.f167932a.length() == 0) {
                    C87412m.m108594g(sb4, "<set-?>");
                    aVar2.f167932a = sb4;
                    aVar2.f167933b = hashCode;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sourceid", aVar2.f167932a);
                    jSONObject.put("traceid", sb4);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "json.toString()");
                    intent2.putExtra("key_jump_id", jSONObject2);
                } catch (JSONException e) {
                    Log.m105920e("FinderJumpDataManager", e.getMessage());
                }
                Log.m105924i("FinderJumpDataManager", "[initJumpData] " + simpleName + " taskId=" + intValue + ", finderTaskId=" + cVar2.f167940e + ", activityId=" + aVar2.f167933b + ", sourceId=" + aVar2.f167932a + ", traceId=" + sb4 + ", fromCommentScene=" + i5 + ", toCommentScene=" + i3 + ", entranceType=" + i4);
            }
            if (f != null) {
                String stringExtra = intent2.getStringExtra("key_jump_id");
                f.f38111y = stringExtra != null ? C112551y.m153814n(stringExtra, ",", ";", false) : "";
            }
        }
    }
}
