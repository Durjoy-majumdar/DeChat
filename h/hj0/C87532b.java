package hj0;

import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hj0.b */
public class C87532b {

    /* renamed from: a */
    public Map<String, String> f253588a = new HashMap();

    /* renamed from: a */
    public String mo122001a(String str) {
        return (String) ((HashMap) this.f253588a).get(str);
    }

    /* renamed from: b */
    public void mo122002b(String str, String str2) {
        ((HashMap) this.f253588a).put(str, str2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((HashMap) this.f253588a).entrySet()) {
            sb.append(entry.getKey());
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(entry.getValue());
            sb.append("\n");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
