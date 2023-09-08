package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.lang.reflect.Field;
import p749xh.C118881x7;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.v */
public class C115913v extends C118881x7 {

    /* renamed from: p1 */
    public static final IAutoDBItem.MAutoDBInfo f347794p1 = C118881x7.initAutoDBInfo(C115913v.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f347794p1;
    }

    public String toString() {
        Class<C115913v> cls = C115913v.class;
        StringBuilder sb = new StringBuilder("ResDownloaderRecord {");
        try {
            for (Field field : cls.getSuperclass().getDeclaredFields()) {
                if (field.getName().startsWith(IAutoDBItem.FIELD_PREFIX)) {
                    field.setAccessible(true);
                    Object obj = field.get(this);
                    sb.append(field.getName().replaceFirst(IAutoDBItem.FIELD_PREFIX, ""));
                    sb.append(" = ");
                    sb.append(obj);
                    sb.append(", ");
                }
            }
        } catch (IllegalAccessException e) {
            Log.printErrStackTrace("MicroMsg.ResDownloaderRecord", e, "", new Object[0]);
        }
        try {
            Field field2 = cls.getSuperclass().getSuperclass().getField("systemRowid");
            field2.setAccessible(true);
            sb.append("systemRowid = ");
            sb.append(field2.get(this));
        } catch (IllegalAccessException e2) {
            Log.printErrStackTrace("MicroMsg.ResDownloaderRecord", e2, "", new Object[0]);
        } catch (NoSuchFieldException e3) {
            Log.printErrStackTrace("MicroMsg.ResDownloaderRecord", e3, "", new Object[0]);
        }
        sb.append(" }");
        return sb.toString();
    }
}
