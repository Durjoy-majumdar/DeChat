package com.tencent.thumbplayer.utils;

import android.content.Context;
import java.util.ArrayList;

public class TPDiskReadWrite {
    public static final String TAG = "TPDiskReadWrite";
    private ArrayList<String> mKey = null;
    private LocalCache mKeyCache = null;
    private String mKeyCacheName = null;
    private LocalCache mMessageCache = null;

    public TPDiskReadWrite(Context context, String str) {
        this.mMessageCache = LocalCache.get(context, str);
        String str2 = str + "_key";
        this.mKeyCacheName = str2;
        LocalCache localCache = LocalCache.get(context, str2);
        this.mKeyCache = localCache;
        ArrayList<String> arrayList = (ArrayList) localCache.getAsObject(this.mKeyCacheName);
        this.mKey = arrayList;
        if (arrayList == null) {
            this.mKey = new ArrayList<>();
        }
    }

    public synchronized void clearAllFile() {
        this.mMessageCache.clear();
        this.mKeyCache.clear();
        this.mKey.clear();
    }

    public synchronized ArrayList<String> getKeylist() {
        return (ArrayList) this.mKey.clone();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object readAllFile() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.tencent.thumbplayer.utils.LocalCache r0 = r5.mKeyCache     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = r5.mKeyCacheName     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.getAsObject(r1)     // Catch:{ all -> 0x0052 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0052 }
            r1 = 0
            if (r0 == 0) goto L_0x0050
            int r2 = r0.size()     // Catch:{ all -> 0x0052 }
            if (r2 > 0) goto L_0x0015
            goto L_0x0050
        L_0x0015:
            r2 = 0
        L_0x0016:
            int r3 = r0.size()     // Catch:{ all -> 0x0052 }
            if (r2 >= r3) goto L_0x003f
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0052 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            com.tencent.thumbplayer.utils.LocalCache r4 = r5.mMessageCache     // Catch:{ all -> 0x0052 }
            java.lang.Object r3 = r4.getAsObject(r3)     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            if (r1 != 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x0039:
            r1.add(r3)     // Catch:{ all -> 0x0052 }
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x003f:
            com.tencent.thumbplayer.utils.LocalCache r0 = r5.mMessageCache     // Catch:{ all -> 0x0052 }
            r0.clear()     // Catch:{ all -> 0x0052 }
            com.tencent.thumbplayer.utils.LocalCache r0 = r5.mKeyCache     // Catch:{ all -> 0x0052 }
            r0.clear()     // Catch:{ all -> 0x0052 }
            java.util.ArrayList<java.lang.String> r0 = r5.mKey     // Catch:{ all -> 0x0052 }
            r0.clear()     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            return r1
        L_0x0050:
            monitor-exit(r5)
            return r1
        L_0x0052:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPDiskReadWrite.readAllFile():java.lang.Object");
    }

    public synchronized Object readFile(String str) {
        return this.mMessageCache.getAsObject(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void rmFile(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            com.tencent.thumbplayer.utils.LocalCache r0 = r2.mMessageCache     // Catch:{ all -> 0x002d }
            r0.remove(r3)     // Catch:{ all -> 0x002d }
            java.util.ArrayList<java.lang.String> r0 = r2.mKey     // Catch:{ all -> 0x002d }
            r0.remove(r3)     // Catch:{ all -> 0x002d }
            com.tencent.thumbplayer.utils.LocalCache r3 = r2.mKeyCache     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r2.mKeyCacheName     // Catch:{ all -> 0x002d }
            r3.remove(r0)     // Catch:{ all -> 0x002d }
            java.util.ArrayList<java.lang.String> r3 = r2.mKey     // Catch:{ all -> 0x002d }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            com.tencent.thumbplayer.utils.LocalCache r3 = r2.mKeyCache     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r2.mKeyCacheName     // Catch:{ all -> 0x002d }
            java.util.ArrayList<java.lang.String> r1 = r2.mKey     // Catch:{ all -> 0x002d }
            r3.put((java.lang.String) r0, (java.io.Serializable) r1)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPDiskReadWrite.rmFile(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void writeFile(java.lang.String r2, java.io.Serializable r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L_0x0033
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0033
        L_0x000a:
            com.tencent.thumbplayer.utils.LocalCache r0 = r1.mMessageCache     // Catch:{ all -> 0x0030 }
            r0.remove(r2)     // Catch:{ all -> 0x0030 }
            com.tencent.thumbplayer.utils.LocalCache r0 = r1.mMessageCache     // Catch:{ all -> 0x0030 }
            r0.put((java.lang.String) r2, (java.io.Serializable) r3)     // Catch:{ all -> 0x0030 }
            java.util.ArrayList<java.lang.String> r3 = r1.mKey     // Catch:{ all -> 0x0030 }
            r3.remove(r2)     // Catch:{ all -> 0x0030 }
            java.util.ArrayList<java.lang.String> r3 = r1.mKey     // Catch:{ all -> 0x0030 }
            r3.add(r2)     // Catch:{ all -> 0x0030 }
            com.tencent.thumbplayer.utils.LocalCache r2 = r1.mKeyCache     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r1.mKeyCacheName     // Catch:{ all -> 0x0030 }
            r2.remove(r3)     // Catch:{ all -> 0x0030 }
            com.tencent.thumbplayer.utils.LocalCache r2 = r1.mKeyCache     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r1.mKeyCacheName     // Catch:{ all -> 0x0030 }
            java.util.ArrayList<java.lang.String> r0 = r1.mKey     // Catch:{ all -> 0x0030 }
            r2.put((java.lang.String) r3, (java.io.Serializable) r0)     // Catch:{ all -> 0x0030 }
            monitor-exit(r1)
            return
        L_0x0030:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0033:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPDiskReadWrite.writeFile(java.lang.String, java.io.Serializable):void");
    }
}
