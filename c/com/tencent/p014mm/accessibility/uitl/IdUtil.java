package com.tencent.p014mm.accessibility.uitl;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.type.IdType;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/uitl/IdUtil;", "", "()V", "ID_MASK", "", "LAYOUT_ID_MASK", "STRING_MASK", "nameCache", "", "", "getName", "id", "getType", "Lcom/tencent/mm/accessibility/type/IdType;", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.uitl.IdUtil */
public final class IdUtil {
    public static final int $stable = 8;
    private static final int ID_MASK = 2131296256;
    public static final IdUtil INSTANCE = new IdUtil();
    private static final int LAYOUT_ID_MASK = 2131492864;
    private static final int STRING_MASK = 2131755008;
    private static final Map<Integer, String> nameCache = new LinkedHashMap();

    private IdUtil() {
    }

    public final String getName(int i) {
        try {
            Map<Integer, String> map = nameCache;
            Integer valueOf = Integer.valueOf(i);
            String str = map.get(valueOf);
            if (str == null) {
                str = MMApplicationContext.getContext().getResources().getResourceName(i);
                C87412m.m108593f(str, "getContext().resources.getResourceName(id)");
                map.put(valueOf, str);
            }
            return str;
        } catch (Throwable unused) {
            nameCache.put(Integer.valueOf(i), "unknow Resource");
            return "unknow Resource";
        }
    }

    public final IdType getType(int i) {
        return (i & C0966R.C0971layout.f6236a) == C0966R.C0971layout.f6236a ? IdType.Layout : (i & C0966R.C0970id.f5229b) == C0966R.C0970id.f5229b ? IdType.Id : (i & C0966R.raw.aa_entrance_icon) == C0966R.raw.aa_entrance_icon ? IdType.String : IdType.Unknow;
    }
}
