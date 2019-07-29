package com.kevin.message.protocol.compress;

/**
 * 不做任何压缩/解压处理
 * @author liangxuekai
 *
 */
public class UnCompress implements ICompress {

	@Override
	public byte[] unzip(byte[] bytes) throws Exception {
		return bytes;
	}

	@Override
	public byte[] zip(byte[] bytes) throws Exception {
		return bytes;
	}

}
