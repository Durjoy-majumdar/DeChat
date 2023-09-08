package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.framework.app.KindaCacheItem;
import com.tencent.kinda.framework.app.SubCoreKinda;
import com.tencent.kinda.gen.KCacheService;
import java.nio.ByteBuffer;

public class KindaCacheServiceImpl implements KCacheService {
    public byte[] get(String str) {
        KindaCacheItem kindaCacheItem = SubCoreKinda.getCore().getCacheStg().get(str);
        if (kindaCacheItem == null || kindaCacheItem.field_expire_at < System.currentTimeMillis() / 1000) {
            return null;
        }
        return kindaCacheItem.field_value;
    }

    public boolean getBool(String str) {
        byte[] bArr = get(str);
        return bArr != null && bArr.length > 0 && bArr[0] == 1;
    }

    public long getInt64(String str, long j) {
        byte[] bArr = get(str);
        if (bArr.length < 8) {
            return j;
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(bArr);
        allocate.rewind();
        return allocate.getLong();
    }

    public boolean remove(String str) {
        KindaCacheItem kindaCacheItem = SubCoreKinda.getCore().getCacheStg().get(str);
        if (kindaCacheItem != null) {
            return SubCoreKinda.getCore().getCacheStg().delete(kindaCacheItem, new String[0]);
        }
        return true;
    }

    public void set(String str, byte[] bArr, long j) {
        KindaCacheItem kindaCacheItem = new KindaCacheItem();
        kindaCacheItem.field_key = str;
        kindaCacheItem.field_value = bArr;
        if (j == 0) {
            kindaCacheItem.field_expire_at = (System.currentTimeMillis() / 1000) + 315360000;
        } else {
            kindaCacheItem.field_expire_at = (System.currentTimeMillis() / 1000) + j;
        }
        SubCoreKinda.getCore().getCacheStg().save(kindaCacheItem);
    }

    public void setBool(String str, boolean z, long j) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        }
        set(str, bArr, j);
    }

    public void setInt64(String str, long j, long j2) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[(8 - i) - 1] = (byte) ((int) (255 & j));
            j >>= 8;
        }
        set(str, bArr, j2);
    }
}
