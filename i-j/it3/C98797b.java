package it3;

import com.tencent.qbar.C19931a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: it3.b */
public class C98797b {

    /* renamed from: f */
    public static C98797b f289645f = new C98797b();

    /* renamed from: a */
    public Map<Long, String> f289646a = new HashMap();

    /* renamed from: b */
    public Map<Long, Object> f289647b = new HashMap();

    /* renamed from: c */
    public Map<String, List<Long>> f289648c = new HashMap();

    /* renamed from: d */
    public Object f289649d = new Object();

    /* renamed from: e */
    public ExecutorService f289650e;

    public C98797b() {
        new C19931a();
        StringBuilder sb = new StringBuilder();
        sb.append("BaseQBarAIDecoder");
        sb.append("_");
        sb.append("FileDecodeQueue");
        this.f289650e = Executors.newSingleThreadExecutor();
    }
}
