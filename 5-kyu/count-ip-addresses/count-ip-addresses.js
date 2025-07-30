function ipsBetween(start, end) {
  function ipToNumber(ip) {
    return ip.split('.').reduce((acc, octet) => {
      return acc * 256 + parseInt(octet, 10);
    }, 0);
  }
  
  return ipToNumber(end) - ipToNumber(start);
}