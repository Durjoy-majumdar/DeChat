package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;

final class zzd implements FastParser.zza<Double> {
    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        return Double.valueOf(fastParser.zzh(bufferedReader));
    }
}
