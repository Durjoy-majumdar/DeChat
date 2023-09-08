package p1207p9;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p9.a */
public class C117992a extends JceStruct {

    /* renamed from: d */
    public HashMap<String, HashMap<String, byte[]>> f352683d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, Object> f352684e;

    /* renamed from: f */
    public String f352685f;

    static {
        Class<C117992a> cls = C117992a.class;
    }

    public C117992a() {
        new HashMap(128);
        this.f352684e = new HashMap<>(128);
        this.f352685f = "GBK";
        new JceInputStream();
    }

    /* renamed from: a */
    public final void mo182753a(ArrayList<String> arrayList, Object obj) {
        if (obj.getClass().isArray()) {
            if (!obj.getClass().getComponentType().toString().equals("byte")) {
                throw new IllegalArgumentException("only byte[] is supported");
            } else if (Array.getLength(obj) > 0) {
                arrayList.add("java.util.List");
                mo182753a(arrayList, Array.get(obj, 0));
            } else {
                arrayList.add("Array");
                arrayList.add("?");
            }
        } else if (obj instanceof Array) {
            throw new IllegalArgumentException("can not support Array, please use List");
        } else if (obj instanceof List) {
            arrayList.add("java.util.List");
            List list = (List) obj;
            if (list.size() > 0) {
                mo182753a(arrayList, list.get(0));
            } else {
                arrayList.add("?");
            }
        } else if (obj instanceof Map) {
            arrayList.add("java.util.Map");
            Map map = (Map) obj;
            if (map.size() > 0) {
                Object next = map.keySet().iterator().next();
                Object obj2 = map.get(next);
                arrayList.add(next.getClass().getName());
                mo182753a(arrayList, obj2);
                return;
            }
            arrayList.add("?");
            arrayList.add("?");
        } else {
            arrayList.add(obj.getClass().getName());
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void display(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).display(this.f352683d, "_data");
    }

    public boolean equals(Object obj) {
        return JceUtil.equals((Object) 1, (Object) ((C117992a) obj).f352683d);
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f352683d.clear();
        HashMap hashMap = new HashMap();
        hashMap.put("", new byte[]{0});
        this.f352683d.put("", hashMap);
        this.f352683d = (HashMap) jceInputStream.read(this.f352683d, 0, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f352683d, 0);
    }
}
