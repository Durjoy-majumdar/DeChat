package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;

final class zza implements FastParser.zza<Integer> {
    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        return Integer.valueOf(fastParser.zzd(bufferedReader));
    }
}
