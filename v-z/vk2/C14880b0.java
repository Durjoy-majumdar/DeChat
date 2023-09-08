package vk2;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: vk2.b0 */
public final class C14880b0 {

    /* renamed from: a */
    public final HashMap<String, C14881a> f40908a = new HashMap<>();

    /* renamed from: vk2.b0$a */
    public static final class C14881a {

        /* renamed from: a */
        public final WXMediaMessage f40909a;

        /* renamed from: b */
        public final String f40910b;

        public C14881a(WXMediaMessage wXMediaMessage, String str) {
            this.f40909a = wXMediaMessage;
            this.f40910b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14881a)) {
                return false;
            }
            C14881a aVar = (C14881a) obj;
            return C87412m.m108589b(this.f40909a, aVar.f40909a) && C87412m.m108589b(this.f40910b, aVar.f40910b);
        }

        public int hashCode() {
            WXMediaMessage wXMediaMessage = this.f40909a;
            int i = 0;
            int hashCode = (wXMediaMessage == null ? 0 : wXMediaMessage.hashCode()) * 31;
            String str = this.f40910b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ScanBoxShareInfo(appMsg=" + this.f40909a + ", imageUrl=" + this.f40910b + ')';
        }
    }
}
