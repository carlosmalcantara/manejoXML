<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	
		<html>
		<head>
		<title>Cruceros</title>
				<link rel="stylesheet" href="estilo2.css" />
		
		</head>
		<body>
		<xsl:for-each select="cruceros/crucero">
			<p>
				Destino: <xsl:value-of select="destino"/>
				<br />
				Dias: <xsl:value-of select="detalles/cia"/>
				<br />
				Dias: <xsl:value-of select="detalles/dias"/>
				<br />
				Fecha salida: <xsl:value-of select="detalles/fechaSalida"/>
			</p>
			<table>
				<tr>
				<th>Dia</th>
				<th>Parada</th>
				<th>Llegada</th>
				<th>Salida</th>
				</tr>
				<xsl:for-each select="escalas/escala">
					<tr>
					<td><xsl:value-of select="@dia"/></td>
					<td class="masAncho"><xsl:value-of select="parada"/></td>
					<td><xsl:value-of select="llegada"/></td>
					<td><xsl:value-of select="salida"/></td>
					</tr>
				</xsl:for-each>
			</table>
		</xsl:for-each>
		</body>
		</html>
		
	</xsl:template>
</xsl:stylesheet>