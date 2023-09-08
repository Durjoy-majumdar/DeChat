package com.tencent.tav.core;

import com.tencent.tav.decoder.EncoderWriter;

public interface IAssetWriter extends IContextCreate {
    EncoderWriter encoderWriter();
}
